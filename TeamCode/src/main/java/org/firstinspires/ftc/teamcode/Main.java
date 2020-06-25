package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name = "Main")
public class Main extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        Robot robotel = new Robot();
        robotel.initialization(hardwareMap);
        
        final int MAX_SPEED = 1;
        final int MIN_SPEED = 0;

        telemetry.addData("Say", "Hello driver!");
        telemetry.update();

        waitForStart();

        while(opModeIsActive())
        {
            robotel.right_motor.setPower(Range.clip(gamepad1.left_stick_y+gamepad1.right_stick_x,-1,1)/3);
            robotel.left_motor.setPower(Range.clip(-gamepad1.left_stick_y+gamepad1.right_stick_x,-1,1)/3);

            if(gamepad1.x)
                robotel.perie_motor.setPower(MAX_SPEED);
            else if(gamepad1.b)
                robotel.perie_motor.setPower(MIN_SPEED);
        }
    }
}
