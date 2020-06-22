package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {
    // initializam robotul. Pt a initializa robotul initializam motoarele
    DcMotor right_motor;
    DcMotor left_motor;
    DcMotor perie_motor;
    //initializam electronica robotului
    public void initialization (HardwareMap map)
    {
        right_motor= map.dcMotor.get("motor_dreapta");
        left_motor=map.dcMotor.get("motor_stanga");
        perie_motor=map.dcMotor.get("motor_perie");
    }
}
