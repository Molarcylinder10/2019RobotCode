package org.usfirst.frc.team1672.robot.commands;

import org.usfirst.frc.team1672.robot.OI;
import org.usfirst.frc.team1672.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExtendIntake extends Command {

    public ExtendIntake() {
    	requires(Robot.m_driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	if(OI.controller.getTriggerAxis(Hand.kLeft)!=0)
    	{
    		Robot.m_intakeSubsystem.extendIntake(OI.controller.getTriggerAxis(Hand.kLeft));
    	}
    	else
    	{
    		Robot.m_intakeSubsystem.extendIntake(-OI.controller.getTriggerAxis(Hand.kRight));
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
