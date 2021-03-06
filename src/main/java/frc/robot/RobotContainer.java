/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.SlewRateLimiter;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.FlyWheel;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.*;
import frc.robot.commands.RunIntake;
import frc.robot.commands.SpinFlyWheel;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  // Subsystems
  private final DriveTrain m_DriveTrain = new DriveTrain();
  private final FlyWheel m_FlyWheel = new FlyWheel();
  private final Intake m_Intake = new Intake();

  // Joysticks
  public final Joystick leftStick = new Joystick(Constants.OIConstants.kLeftJoystick);
  public final Joystick rightStick = new Joystick(Constants.OIConstants.kRightJoystick);

  // Commands
  private final CommandBase m_flywheelCommand = new SpinFlyWheel(m_FlyWheel);
  private final CommandBase m_intakeCommand = new RunIntake(m_Intake);

  //Slew Rate Limiter (makes an acceleration)
  //private final SlewRateLimiter m_speedLimiter = new SlewRateLimiter(3);


  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {

    //Creates Tank Drive ((really finnicky))
    m_DriveTrain.setDefaultCommand(
      new RunCommand(() -> m_DriveTrain.tankDrive(
        rightStick.getY(),
        leftStick.getY()), m_DriveTrain));

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    //Flywheel
    new JoystickButton(rightStick, OIConstants.kFlyWheelButton).whileHeld(m_flywheelCommand);

    //Intake
    new JoystickButton(leftStick, OIConstants.kIntakeButton).whileHeld(m_intakeCommand);

  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
  //}
}
