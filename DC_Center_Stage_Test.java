package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;

@TeleOp(name="DC_Center_Stage_Test")

public class DC_Center_Stage_Test extends LinearOpMode{
     DcMotor Front_Right_Wheel = null;
     DcMotor Front_Left_Wheel  = null;
     DcMotor Back_Right_Wheel  = null;
     DcMotor Back_Left_Wheel   = null;

     @Override
    public void runOpMode() {
        Front_Right_Wheel  = hardwareMap.get(DcMotor.class, "Wheel_1");
        Front_Left_Wheel  = hardwareMap.get(DcMotor.class, "motor_2");
        Back_Right_Wheel  = hardwareMap.get(DcMotor.class, "motor_3");
        Back_Left_Wheel   = hardwareMap.get(DcMotor.class, "motor_4");

        double y = -gamepad1.left_stick_y; //reverses the y axis allowing for only forward and backwards movement
        double x = gamepad1.left_stick_x;
        double rx = gamepad1.right_stick_x;


        Front_Right_Wheel.setPower(y+rx);
        Front_Left_Wheel.setPower(y-rx);
        Back_Left_Wheel.setPower(0);
        Back_Right_Wheel.setPower(0);



    }
}
