/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*;

/**
 * Add your docs here.
 */
public class Intake extends SubsystemBase {


  // Shuffleboard
    final String IntakeSpeed ="IntakeSpeed";
    private Double setSpeed;
    
    //Motor
    private final WPI_VictorSPX Intake = new WPI_VictorSPX(MotorConstants.kIntakeMotor);
    
    //Periodic
    @Override
    public void periodic() {
    }

    //Run
    public void Run() {
        double backup = SpeedConstants.kIntakeSpeed;
        setSpeed = getPreferencesDouble(IntakeSpeed ,backup);
        Intake.set(setSpeed);
    }

    //Stop
    public void Stop() {
        Intake.set(0.0);
    }
    
    // Preferences
    private static double getPreferencesDouble(String key, double backup) {
    Preferences preferences = Preferences.getInstance();
    if(!preferences.containsKey(key)) {
      preferences.putDouble(key, backup);
    }
    return preferences.getDouble(key, backup);
    }
}
