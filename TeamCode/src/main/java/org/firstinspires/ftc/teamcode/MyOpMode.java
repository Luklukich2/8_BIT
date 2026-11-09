package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MyOpMode extends LinearOpMode {
    DcMotor myMotor0 = null;
    DcMotor myMotor1 = null;
    DcMotor myMotor2 = null;
    DcMotor myMotor3 = null;

    @Override
    public void runOpMode() {
        myMotor0 = hardwareMap.get(DcMotor.class,"motor0");
        myMotor1 = hardwareMap.get(DcMotor.class,"motor1");
        myMotor2 = hardwareMap.get(DcMotor.class,"motor2");
        myMotor3 = hardwareMap.get(DcMotor.class,"motor3");
        waitForStart();

        while (opModeIsActive()) { // void loop
            myMotor0.setPower(gamepad1.left_stick_y);
            myMotor1.setPower(gamepad1.left_stick_y);
            myMotor2.setPower(-gamepad1.left_stick_y);
            myMotor3.setPower(-gamepad1.left_stick_y);

            myMotor0.setPower(-gamepad1.left_stick_x);
            myMotor1.setPower(-gamepad1.left_stick_x);
            myMotor2.setPower(-gamepad1.left_stick_x);
            myMotor3.setPower(-gamepad1.left_stick_x);

            myMotor0.setPower(gamepad1.right_stick_x);
            myMotor1.setPower(-gamepad1.right_stick_x);

            myMotor3.setPower(gamepad1.right_stick_x);
            myMotor2.setPower(-gamepad1.right_stick_x);
        }
    }
}