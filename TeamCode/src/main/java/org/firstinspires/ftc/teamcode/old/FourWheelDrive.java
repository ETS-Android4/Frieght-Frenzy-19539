package org.firstinspires.ftc.teamcodeld.o;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "FourWheelDrive", group = "LinearOpMode")
public class FourWheelDrive extends OpMode {
    // initializing motors
    DcMotor left;
    DcMotor right;
    DcMotor intake;

    @Override
    public void init() {
        // mapping motor variables to the motor configurations of the robot
        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");
        intake = hardwareMap.dcMotor.get("intake");

        right.setDirection(DcMotorSimple.Direction.REVERSE);
        left.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop() {

        int intakePower = gamepad1.right_bumper ? 1 : 0;

        telemetry.addData("Right stick y: ", gamepad1.right_stick_y);
        telemetry.addData("Left stick y: ", gamepad1.left_stick_y);
        telemetry.addData("A button: ", gamepad1.a);


        right.setPower(gamepad1.right_stick_y);
        left.setPower(-gamepad1.left_stick_y); // reverse direction of left motor

        intake.setPower(intakePower);
    }
}