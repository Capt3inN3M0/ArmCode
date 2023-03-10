// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ArmCommand;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem m_DriveSubsystem = new DriveSubsystem();
  private final ArmSubsystem m_ArmSubsystem = new ArmSubsystem();


  private final XboxController m_controller = new XboxController(1);
  private final Joystick m_joystick = new Joystick(0);

  private final Command m_driveCommand = new DriveCommand(
    m_DriveSubsystem,
    () -> m_controller.getLeftY(),
    () -> m_controller.getRightX()
  );

  private final Command m_extendCommand = new ArmCommand(m_ArmSubsystem,
    () -> m_joystick.getY(),
    () -> m_joystick.getTrigger());
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    m_DriveSubsystem.setDefaultCommand(m_driveCommand);
    m_ArmSubsystem.setDefaultCommand(m_extendCommand);

    
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
   new JoystickButton(m_joystick, 1)
    .whenPressed(new InstantCommand(() -> m_ArmSubsystem.setExtendSetPoint(Constants.Arm.Extend.HYBRID_SETPOINT))); 

   new JoystickButton(m_joystick, 2)
    .whenPressed(new InstantCommand(() -> m_ArmSubsystem.setExtendSetPoint(Constants.Arm.Extend.MID_SETPOINT)));

   new JoystickButton(m_joystick, 3)
    .whenPressed(new InstantCommand(() -> m_ArmSubsystem.setExtendSetPoint(Constants.Arm.Extend.HIGH_SETPOINT)));

   new JoystickButton(m_joystick, 4)
    .whenPressed(new InstantCommand(() -> m_ArmSubsystem.setPivotSetPoint(Constants.Arm.Pivot.HYBRID_SETPOINT)));
   
   new JoystickButton(m_joystick, 5)
    .whenPressed(new InstantCommand(() -> m_ArmSubsystem.setPivotSetPoint(Constants.Arm.Pivot.MID_SETPOINT)));
   
   new JoystickButton(m_joystick, 6)
    .whenPressed(new InstantCommand(() -> m_ArmSubsystem.setPivotSetPoint(Constants.Arm.Pivot.HIGH_SETPOINT)));

  
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}

