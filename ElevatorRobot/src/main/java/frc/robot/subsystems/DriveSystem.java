/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSystem extends SubsystemBase {
  public WPI_TalonSRX m_frontLeft;
  public WPI_TalonSRX m_rearLeft;
  public WPI_TalonSRX m_frontRight;
  public WPI_TalonSRX m_rearRight;
  DifferentialDrive m_drive;


/**
   * Creates a new DriveSystem.
   * set up motors and speed controllers and diff drive
   */
  public DriveSystem() {
   m_frontLeft = new WPI_TalonSRX(6);
   m_rearLeft = new WPI_TalonSRX(1);
   SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);
   

    m_frontRight = new WPI_TalonSRX(4);
    m_rearRight = new WPI_TalonSRX(7);
    SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

    m_drive = new DifferentialDrive(m_left, m_right);
  }
   
  // create function call tankDrive
  // 2 arguments
  // leftSpeed, rightSpeed
public void tankDrive (double leftSpeed, double rightSpeed) {
  
 m_drive.tankDrive(leftSpeed, rightSpeed);
   
  }





  }

  

