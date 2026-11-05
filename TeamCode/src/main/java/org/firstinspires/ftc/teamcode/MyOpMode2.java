package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public abstract class MyOpMode2 extends LinearOpMode {
    public double Ts_us = 2000;
    public double Ts_s = (Ts_us / 1000000.0);
    public double robot_widht = 0.2;
    public int wheel_radius = 0; // robot wheel radius
    public double w_r = (0.6 * 180) / 57.3; // angle speed right motor
    public double w_l = (0.6 * 180) / 57.3; // angle speed left motor
    public double v_r = w_r * wheel_radius; // right motor speed
    public double v_l = w_l * wheel_radius; // left motor speed
    public double v_mid = (v_l + v_r) / 2; // middle speed of all motors
    public double theta_i = (v_r - v_l) / robot_widht;

    public double odom_S = v_mid * Ts_s; // +=, but I don`t know why it doesn`t work.
    public double odom_theta = theta_i * Ts_s; // +=, but I don`t know why it doesn`t work.


    DcMotor myMotor0 = null;
    DcMotor myMotor1 = null;
    DcMotor myMotor2 = null;
    DcMotor myMotor3 = null;


    // behaviors
    public void RunOpMode(double odom_S0, double odom_theta0) {
        myMotor0 = hardwareMap.get(DcMotor.class, "motor0");
        myMotor1 = hardwareMap.get(DcMotor.class, "motor1");
        myMotor2 = hardwareMap.get(DcMotor.class, "motor2");
        myMotor3 = hardwareMap.get(DcMotor.class, "motor3");
        waitForStart();

        while (odom_S != odom_S0) { // the condition
            myMotor0.setPower(0.6);
            myMotor1.setPower(0.6);
            myMotor2.setPower(-0.6);
            myMotor3.setPower(-0.6);
        }
    }
}
