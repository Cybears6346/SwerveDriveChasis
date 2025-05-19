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

// Visual Representation of Swerve Chasis 

//  Front
//  Module 1, Module 2
//  Module 3, Module 4
//  Back



public final class Constants {
  public static class OperatorConstants {

    //Controller Constants
    public static final int kOperatorControllerPort = 1;
    public static final int kDriverControllerPort = 0;

    //Drive Constants 
    public static final int driveMotor1ID = 1;
    public static final int turnMotor1ID = 2;

    public static final int driveMotor2ID = 3;
    public static final int turnMotor2ID = 4;

    public static final int driveMotor3ID = 5;
    public static final int turnMotor3ID = 6;

    public static final int driveMotor4ID = 7; 
    public static final int turnMotor4ID = 8;

    //Mechanical Motor Constants

  
    //Gear Ratio/ Misc Constants

    public static final int pigeonID = 0;


    
    
  }

}
