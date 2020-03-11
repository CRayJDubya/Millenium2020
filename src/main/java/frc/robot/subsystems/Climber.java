/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SpeedConstants;
import frc.robot.Constants.*;

public class Climber extends SubsystemBase {
  /**
   * Creates a new Climber.
   */


      // Shuffleboard
      final String ClimbSpeed ="ClimbSpeed";
      private Double setSpeed;
      
      //Motor
      private final WPI_TalonSRX Climb = new WPI_TalonSRX(MotorConstants.kClimbMotor);


      //Run
      public void Run() {
        double backup = SpeedConstants.kClimbSpeed;
        setSpeed = getPreferencesDouble(ClimbSpeed ,backup);
        Climb.set(setSpeed);
    }

    //Stop
    public void Stop() {
      Climb.set(0.0);
  }
  
  // Preferences
  private static double getPreferencesDouble(String key, double backup) {
  Preferences preferences = Preferences.getInstance();
  if(!preferences.containsKey(key)) {
    preferences.putDouble(key, backup);
  }
  return preferences.getDouble(key, backup);
  }

  //Periodic
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
