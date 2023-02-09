// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  
    public static final class Drive {
//drivetrain PID final variables 
        public static final class Drivetrain {

            public static final double kP = 0;
            public static final double kI = 0;
            public static final double kD = 0;
            public static final double kIz = 0;
            public static final double zFF = 0;

        }
    }
    public static final class Arm {

            

        public static final class Pivot {

            public static final double kP = 0;
            public static final double kI = 0;
            public static final double kD = 0;
            public static final double kIz = 0;
            public static final double zFF = 0;

            public static final double hybridSetpoint = 0;
            public static final double midSetpoint = 0;
            public static final double highSetpoint = 0;

            public static final double pivotHybridRotations = 0;
            public static final double pivotMidRotations = 0;
            public static final double pivotHighRotations = 0;
            
            public static final double yScale = 1; 

            //in motor rotations
            public static final float pivotReverseSoftLimit = 1;
            public static final float pivotForwardSoftLimit = 1;
            public static final double backHardLimit = 0;
            public static final double frontHardLimit = 0;

            public static final int leftMotor = 0; 
            public static final int rightMotor = 0;
            
            public static final double gearRatio = 10.71;
            public static final double maxVelocity = 0;
            public static final double maxAcceleration = 0;

            public static final double minAngle = 0;
        }
        public static final class Extend {

            public static final double kP = 0;
            public static final double kI = 0;
            public static final double kD = 0;
            public static final double kIz = 0;
            public static final double zFF = 0;

            public static final double hybridSetpoint = 0;
            public static final double midSetpoint = 0;
            public static final double highSetpoint = 0;

            public static final double extendHybridRotations = 0;
            public static final double extendMidRotations = 0;
            public static final double extendHighRotations = 0;

            public static final double yScale = 1;

            public static final float extendReverseSoftLimit = 1;
            public static final float extendForwardSoftLimit = 1;
            public static final double backHardLimit = 0;
            public static final double frontHardLimit = 0;

            public static final int extendMotor = 0; 

            public static final double gearRatio = 3;
            public static final double maxVelocity = 0;
            public static final double maxAcceleration = 0;

            

        }
    }
}
