package org.firstinspires.ftc.teamcode.old;

import com.qualcomm.robotcore.hardware.DcMotor;

public class FirstEncoderTest {
    public static DcMotor motorLeft;
    public static DcMotor motorRight;


    public static void DriveForward(double power) {
        motorLeft.setPower(power);
        motorRight.setPower(power);
    }

    public static void StopDriving() {
        DriveForward(0);
    }

    public static void TurnLeft(double power) {
        motorLeft.setPower(-power);
        motorRight.setPower(power);
    }

    public static void DriveForwardDistance(double power, int distance) {
        motorLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorLeft.setTargetPosition(distance);
        motorRight.setTargetPosition(distance);

        motorLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        DriveForward(power);
        while (motorLeft.isBusy() && motorRight.isBusy()) {
            assert true;
        }

        StopDriving();
        motorLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
}