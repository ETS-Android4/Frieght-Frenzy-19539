package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@Autonomous(name = "FirstAutonomousTest", group = "Linear OpMode")
public class FirstAutonomousTest extends LinearOpMode {
    DcMotor left = hardwareMap.dcMotor.get("left");
    DcMotor right = hardwareMap.dcMotor.get("right");

    double power = 1.0;


    @Override
    public void runOpMode() {

        right.setDirection(DcMotorSimple.Direction.REVERSE);
        left.setDirection(DcMotorSimple.Direction.REVERSE);

        right.setDirection(DcMotorSimple.Direction.REVERSE);
        left.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        left.setPower(power);
        right.setPower(power);

        sleep(10000);
    }
}