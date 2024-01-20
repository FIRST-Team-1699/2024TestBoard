// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  private CANSparkMax motor23;
  private CANSparkMax motor30;

  private final int motor23ID = 23;
  private final int motor30ID = 30;

  private double motor23Setpoint = 0.0;
  private double motor30Setpoint = 0.0;

  @Override
  public void robotInit() {
    motor23 = new CANSparkMax(motor23ID, MotorType.kBrushless);
    motor30 = new CANSparkMax(motor30ID, MotorType.kBrushless);
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    SmartDashboard.putNumber("Motor 23", motor23Setpoint);
    SmartDashboard.putNumber("Motor 30", motor30Setpoint);
  }

  @Override
  public void teleopPeriodic() {
    motor23Setpoint = SmartDashboard.getNumber("Motor 23", 0.0);
    motor30Setpoint = SmartDashboard.getNumber("Motor 30", 0.0);

    motor23.set(motor23Setpoint);
    motor30.set(motor30Setpoint);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
