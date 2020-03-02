/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain
   */

  //Left Drive
  private final WPI_TalonSRX frontLeftMotor = new WPI_TalonSRX(Constants.DriveConstants.kFrontLeftMotorPort);
  private final WPI_VictorSPX backLeftMotor = new WPI_VictorSPX(Constants.DriveConstants.kBackLeftMotorPort);
  

  //Right Drive
  private final WPI_TalonSRX frontRightMotor = new WPI_TalonSRX(Constants.DriveConstants.kFrontRightMotorPort);
  private final WPI_VictorSPX backRightMotor = new WPI_VictorSPX(Constants.DriveConstants.kBackRightMotorPort);

  //Motor Groups
  private SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
  private SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(frontRightMotor, backRightMotor);

  //Grouped Motor Groups
  private DifferentialDrive robotDrive = new  DifferentialDrive(leftMotorGroup, rightMotorGroup);
  
  public DriveTrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {

    robotDrive.tankDrive(leftSpeed, rightSpeed);
  }
}
