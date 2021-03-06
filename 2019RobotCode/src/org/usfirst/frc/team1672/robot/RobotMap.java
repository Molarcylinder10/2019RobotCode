/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1672.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int leftDriveID = 0;
	public static final int rightDriveID = 1;
	public static final int intakeExtenderID = 2;
	public static final int clawExtenderID = 3;
	public static final int intakeTurnerID = 4;
	
	public static VictorSP leftDrive = new VictorSP(leftDriveID);
	public static VictorSP rightDrive = new VictorSP(rightDriveID);
	public static VictorSP intakeExtender = new VictorSP(intakeExtenderID);
	public static VictorSP clawExtender = new VictorSP(clawExtenderID);
	public static VictorSP intakeTurner = new VictorSP(intakeTurnerID);
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
