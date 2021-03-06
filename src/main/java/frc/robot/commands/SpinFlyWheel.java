/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.FlyWheel;

public class SpinFlyWheel extends CommandBase {

  private final FlyWheel m_flyWheel;

  public SpinFlyWheel(FlyWheel subsystem) {
    m_flyWheel = subsystem;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Run
  @Override
  public void execute() {
    m_flyWheel.Run();
  }

  // End
  @Override
  public void end(final boolean interrupted) {
    m_flyWheel.Stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
