package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name = "headlessMain")

public class headlessMain extends LinearOpMode{

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
            final double x = Math.pow(gamepad1.left_stick_x, 3.0);
            final double y = Math.pow(gamepad1.left_stick_y, 3.0);

            final double rotation = Math.pow(gamepad1.right_stick_x, 3.0);
            final double direction = Math.atan2(x, y) + robotel.getHeading();
            final double speed = Math.min(1.0, Math.sqrt(x * x + y * y));

            final double lf = speed * Math.sin(direction + Math.PI / 4.0) + rotation;
            final double rf = speed * Math.cos(direction + Math.PI / 4.0) - rotation;
            final double lr = speed * Math.cos(direction + Math.PI / 4.0) + rotation;
            final double rr = speed * Math.sin(direction + Math.PI / 4.0) - rotation;

            robotel.setMotors(lf, lr, rf, rr);
        }
    }
}
