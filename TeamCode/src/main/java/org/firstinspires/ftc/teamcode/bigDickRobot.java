package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.hardware.bosch.BNO055IMU;

public class bigDickRobot {

    DcMotor flMotor, frMotor, blMotor, brMotor, brushMotor;
    Gyroscope gyro;

    public void initialization (HardwareMap map)
    {
        flMotor = map.dcMotor.get("flMotor");
        frMotor = map.dcMotor.get("frMotor");
        blMotor = map.dcMotor.get("blMotor");
        brMotor = map.dcMotor.get("brMotor");
        brushMotor=map.dcMotor.get("brushMotor");
        gyro = map..get("gyro");
    }
}
