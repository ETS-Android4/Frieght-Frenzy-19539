package org.firstinspires.ftc.teamcode.old;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="FirstButtonTest")

public class FirstButtonTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        GamepadEx driverOp = new GamepadEx(gamepad1);
        Motor frontLeft = new Motor(hardwareMap, "frontLeft");
        Motor frontRight = new Motor(hardwareMap, "frontRight");
        Motor backLeft = new Motor(hardwareMap, "backLeft");
        Motor backRight = new Motor(hardwareMap, "backRight");
        ServoEx servoOne = new SimpleServo(hardwareMap, "servo", 0, 180);


        backLeft.setInverted(true);

        waitForStart();

        while(opModeIsActive()) {

            int flpower = driverOp.getButton(GamepadKeys.Button.A) ? 1 : 0;

            int frpower = driverOp.getButton(GamepadKeys.Button.B) ? 1 : 0;

            int blpower = driverOp.getButton(GamepadKeys.Button.X) ? 1 : 0;

            int brpower = driverOp.getButton(GamepadKeys.Button.Y) ? 1 : 0;

            int servopower = driverOp.getButton(GamepadKeys.Button.DPAD_UP) ? 1 : 0;

            frontLeft.set(flpower);
            frontRight.set(frpower);
            backLeft.set(blpower);
            backRight.set(brpower);
            servoOne.setPosition(servopower);
        }
    }
}