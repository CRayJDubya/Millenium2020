/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*;

/**
 * Add your docs here.
 */
public class FlyWheel extends SubsystemBase {
    
    //Motor
    private final WPI_TalonSRX flyWheel = new WPI_TalonSRX(OIConstants.kFlyWheelButton);
    
    //Periodic
    @Override
    public void periodic() {
    }

    //Run
    public void Run() {
        flyWheel.set(SpeedConstants.kFlyWheelSpeed);
    }

    //Stop
    public void Stop() {
        flyWheel.set(0.0);
    }
}
