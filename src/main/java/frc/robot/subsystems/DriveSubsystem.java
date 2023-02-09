// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.function.DoubleSupplier;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.Drive.*;

public class DriveSubsystem extends SubsystemBase {

  // drive train stuff
  private CANSparkMax m_leftForwardMtr = new CANSparkMax(1, MotorType.kBrushless);
  private CANSparkMax m_rightForwardMtr = new CANSparkMax(2, MotorType.kBrushless);
  private CANSparkMax m_leftBackwardMtr = new CANSparkMax(3, MotorType.kBrushless);
  private CANSparkMax m_rightBackwardMtr = new CANSparkMax(4, MotorType.kBrushless);
  private DifferentialDrive m_rDrive = new DifferentialDrive(m_leftForwardMtr, m_rightForwardMtr);

  // PID stuff
  private PIDController m_pidController = new PIDController
    (Drivetrain.P,
    Drivetrain.I,
    Drivetrain.D);
  private RelativeEncoder m_leftFrontEncoder;
  private RelativeEncoder m_rightFrontEncoder;
  private RelativeEncoder m_leftBackEncoder;
  private RelativeEncoder m_rightBackEncoder;

  /** Creates a new ExampleSubsystem. */
  public DriveSubsystem() {

    //factory default for motors
    m_rightForwardMtr.restoreFactoryDefaults();
    m_leftForwardMtr.restoreFactoryDefaults();
    m_rightBackwardMtr.restoreFactoryDefaults();
    m_leftBackwardMtr.restoreFactoryDefaults();

    //inverted motors to drive straight
    m_rightBackwardMtr.setInverted(true);
    m_rightForwardMtr.setInverted(true);
    m_leftBackwardMtr.follow(m_leftForwardMtr);
    m_rightBackwardMtr.follow(m_rightForwardMtr);

    //encoders
     m_leftFrontEncoder = m_leftForwardMtr.getEncoder();
     m_rightFrontEncoder = m_rightForwardMtr.getEncoder();
     m_leftBackEncoder = m_leftBackwardMtr.getEncoder();
     m_rightBackEncoder = m_rightBackwardMtr.getEncoder(); 
    
  }

  @Override
  public void periodic() {

  }
  public void ArcadeDrive(DoubleSupplier forward, DoubleSupplier rotation){
    
    m_rDrive.arcadeDrive(forward.getAsDouble(), rotation.getAsDouble());
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
