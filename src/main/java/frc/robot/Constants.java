/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Drive Constants
    public static final class DriveConstants {
        //Left Drive
        public static final int kFrontLeftMotorPort = 2;
        public static final int kBackLeftMotorPort = 4;

        //Right Drive
        public static final int kFrontRightMotorPort = 1;
        public static final int kBackRightMotorPort = 3;
    }

    //Motor Constants
    public static final class MotorConstants {

        //Flywheel Motor
        public static final int kFlyWheel = 5;
        
        //Intake Motor
        public static final int kIntakeMotor = 7;

        //Climb Motors
        public static final int kLiftMotor = 6;
        public static final int kClimbMotor = 8;
    }

    //OI Constants
    public static final class OIConstants {

        //Joysticks
        public static final int kLeftJoystick = 1;
        public static final int kRightJoystick = 0;

        //Button Mapping
        public static final int kFlyWheelButton = 1;
        public static final int kIntakeButton = 1;
    }

    //Speed Constants
    public static final class SpeedConstants {

        //FlyWheel
        public static final double kFlyWheelSpeed = 0.5;

        //Intake
        public static final double kIntakeSpeed = 0.2;

        //Lift
        public static final double kLiftSpeed = 0.1;

        //Climb
        public static final double kClimbSpeed = 0.5;
    }
}
