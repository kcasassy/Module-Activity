package edu.kimsantos;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.Powerable;

public class Smartphone extends Device {

    public Smartphone(String name, int batteryLevel, Powerable powerBehavior) {

        super(name, batteryLevel, powerBehavior);

    }

    @Override
    public void runDiagnostics() {

        getPowerBehavior().powerOn();

        System.out.println("Running smartphone diagnostics...");

        if (getBatteryLevel() < 30) {

            System.out.println("Phone battery is critically low.");

        } else {

            System.out.println("Phone battery status is good.");

        }
    }
}