package edu.kimsantos;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.Powerable;

public class Laptop extends Device {

    public Laptop(String name, int batteryLevel, Powerable powerBehavior) {

        super(name, batteryLevel, powerBehavior);

    }

    @Override
    public void runDiagnostics() {

        getPowerBehavior().powerOn();

        System.out.println("Running laptop diagnostics...");

        if (getBatteryLevel() < 20) {

            System.out.println("Warning: Low battery!");

        } else {

            System.out.println("Battery level is sufficient.");

        }
    }
}