// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  private CANSparkMax motorOne;
  private CANSparkMax motorTwo;

  private final int motorOneID = 23;
  private final int motorTwoID = 30;

  private double motorOneSetpoint = 0.0;
  private double motorTwoSetpoint = 0.0;

  @Override
  public void robotInit() {
    motorOne = new CANSparkMax(motorOneID, MotorType.kBrushless);
    motorTwo = new CANSparkMax(motorTwoID, MotorType.kBrushless);
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    SmartDashboard.putNumber("Motor One", motorOneSetpoint);
    SmartDashboard.putNumber("Motor Two", motorTwoSetpoint);
  }

  @Override
  public void teleopPeriodic() {
    motorOneSetpoint = SmartDashboard.getNumber("Motor One", 0.0);
    motorTwoSetpoint = SmartDashboard.getNumber("Motor Two", 0.0);

    motorOne.set(motorOneSetpoint);
    motorTwo.set(motorTwoSetpoint);
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
