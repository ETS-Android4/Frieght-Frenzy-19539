package org.firstinspires.ftc.teamcode.old;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.drivebase.DifferentialDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.hardware.motors.MotorGroup;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Tankdrive")

public class Tankdrive extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        GamepadEx driverOp = new GamepadEx(gamepad1);
        Motor frontLeft = new Motor(hardwareMap, "frontLeft");
        Motor frontRight = new Motor(hardwareMap, "frontRight");
        Motor backLeft = new Motor(hardwareMap, "backLeft");
        Motor backRight = new Motor(hardwareMap, "backRight");
        MotorGroup leftMotorGroup = new MotorGroup(frontLeft, backLeft);
        MotorGroup rightMotorGroup = new MotorGroup(frontRight, backRight);


        backLeft.setInverted(true);
        DifferentialDrive tankDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
        waitForStart();

        while(opModeIsActive()) {
            tankDrive.tankDrive(driverOp.getLeftY(), driverOp.getRightY());
        }
    }
}