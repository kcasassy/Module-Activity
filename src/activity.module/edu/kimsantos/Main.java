package edu.kimsantos;

import java.util.ArrayList;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.FastBootPowerOn;
import edu.devicediagnostic.NormalPowerOn;

public class Main {

    public static void main(String[] args) {

        ArrayList<Device> devices = new ArrayList<>();

        devices.add(new Laptop(
                "Iphone 15",
                80,
                new NormalPowerOn()));

        devices.add(new Smartphone(
                "Xiaomi Redmi Note 15",
                40,
                new FastBootPowerOn()));

        devices.add(new Tablet(
                "Iphone 12",
                71,
                new NormalPowerOn()));

        for (Device device : devices) {

            System.out.println("----------------------");

            device.showStatus();

            device.runDiagnostics();

            System.out.println();
        }
    }
}
