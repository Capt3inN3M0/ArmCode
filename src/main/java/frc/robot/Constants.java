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

            public static final double P = 0;
            public static final double I = 0;
            public static final double D = 0;
            

        }
    }
    public static final class Arm {

        public static final class Pivot {

            public static final double P = 0;
            public static final double I = 0;
            public static final double D = 0;

            public static final double HYBRID_SETPOINT = 0;
            public static final double MID_SETPOINT = 0;
            public static final double HIGH_SETPOINT = 0;

            public static final double PIVOT_HYBRID_ROTATIONS = 0;
            public static final double PIVOT_MID_ROTATIONS = 0;
            public static final double PIVOT_HIGH_ROTATIONS = 0;
            
            public static final double Y_SCALE = 1; 

            //in motor rotations
            public static final float PIVOT_REVERSE_SOFT_LIMIT = 1;
            public static final float PIVOT_FORWARD_SOFT_LIMIT = 1;
            public static final double BACK_HARD_LIMIT = 0;
            public static final double FRONT_HARD_LIMIT = 0;

            public static final int LEFT_MOTOR = 0; 
            public static final int RIGHT_MOTOR = 0;
            
            public static final double GEAR_RATIO = 10.71;
            public static final double MAX_VELOCITY = 0;
            public static final double MAX_ACCELERATION = 0;

            public static final double MIN_ANGLE = 0;
            public static final int SWITCH_PORT = 1;
        
        }
        public static final class Extend {

            public static final double P = 0;
            public static final double I = 0;
            public static final double D = 0;
            

            public static final double HYBRID_SETPOINT = 0;
            public static final double MID_SETPOINT = 0;
            public static final double HIGH_SETPOINT = 0;

            public static final double EXTEND_HYBRID_ROTATIONS = 0;
            public static final double EXTEND_MID_ROTATIONS = 0;
            public static final double EXTEND_HIGH_ROTATIONS = 0;

            public static final double Y_SCALE = 1;

            public static final float EXTEND_REVERSE_SOFT_LIMIT = 1;
            public static final float EXTEND_FORWARD_SOFT_LIMIT = 1;
            public static final double BACK_HARD_LIMIT = 0;
            public static final double FRONT_HARD_LIMIT = 0;

            public static final int EXTEND_MOTOR = 0; 

            public static final double GEAR_RATIO = 3;
            public static final double MAX_VELOCITY = 0;
            public static final double MAX_ACCELERATION = 0;

            

        }
    }
}
