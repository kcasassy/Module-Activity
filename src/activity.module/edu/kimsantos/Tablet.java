package edu.kimsantos;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.Powerable;

public class Tablet extends Device {

    public Tablet(String name, int batteryLevel, Powerable powerBehavior) {

        super(name, batteryLevel, powerBehavior);

    }

    @Override
    public void runDiagnostics() {

        getPowerBehavior().powerOn();

        System.out.println("Running tablet diagnostics...");

        if (getBatteryLevel() <= 10) {

            System.out.println("Tablet battery dangerously low.");

        } else {

            System.out.println("Tablet is functioning properly.");

        }
    }
}