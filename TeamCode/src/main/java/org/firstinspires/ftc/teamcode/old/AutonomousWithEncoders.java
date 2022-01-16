package org.firstinspires.ftc.teamcode.old;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class AutonomousWithEncoders extends LinearOpMode {

    private static DcMotor motorLeft;
    private static DcMotor motorRight;
    private final ElapsedTime runtime = new ElapsedTime();
    double power = 0.5;
    int distance = 5;

    @Override
    public void runOpMode() {
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        FirstEncoderTest.DriveForwardDistance(power, distance);
    }
}