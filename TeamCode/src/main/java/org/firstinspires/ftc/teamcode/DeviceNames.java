package org.firstinspires.ftc.teamcode;

public enum DeviceNames {
    LF_MOTOR("leftBack"),
    LB_MOTOR("leftFront"),
    RF_MOTOR("rightFront"),
    RB_MOTOR("rightBack"),
    ARM("arm"),
    SEC_ARM("secondArm"),
    SLIDE("slide"),
    INTAKE("pinch"),
    WRIST1("wrist"),
    WRIST2("wrist2"),
    WRIST3("wrist3"),
    IMU("imu"),
    ODOMCONTROLLER("wheel");





    private final String name;


    private DeviceNames(String name) {
        this.name = name;

    }


    public String toString() {
        return name;
    }

}
