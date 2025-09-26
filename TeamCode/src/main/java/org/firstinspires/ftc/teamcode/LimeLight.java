package org.firstinspires.ftc.teamcode;


import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.hardware.limelightvision.Limelight3A;

import org.firstinspires.ftc.robotcore.external.navigation.Pose3D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class LimeLight implements  MotorFeature{
    Limelight3A limeLight = null;
    Pose3D botpose;

    @Override
    public void init(HardwareMap hardwareMap) {
        limeLight = hardwareMap.get(Limelight3A.class, "lime");
        limeLight.start();
    }

    @Override
    public List<String> driveLoop(Gamepad gamepad1, Gamepad gamepad2) {

        LLResult result = limeLight.getLatestResult();
        if (result != null) {
            if (result.isValid()) {
                botpose = result.getBotpose();

            }
        }
        List<String> telemetryData = new ArrayList();
        telemetryData.add(String.format(Locale.ENGLISH, "",limeLight.getStatus()));
        telemetryData.add(String.format("%4.2f", result.getTx()));
        telemetryData.add(String.format("%4.2f", result.getTy()));
        telemetryData.add(result.getDetectorResults().toString());

//        telemetryData.add(botpose.toString());
        return telemetryData;
    }


    @Override
    public void stop() {

    }

    @Override
    public void goToPosition(Position position) {

    }
}
