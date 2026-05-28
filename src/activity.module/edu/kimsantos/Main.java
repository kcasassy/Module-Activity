package edu.kimsantos;

import java.util.ArrayList;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.FastBootPowerOn;
import edu.devicediagnostic.NormalPowerOn;

public class Main {

    public static void main(String[] args) {

        ArrayList<Device> devices = new ArrayList<>();

        devices.add(new Laptop(
                "Asus Vivobook Go 15",
                80,
                new NormalPowerOn()));

        devices.add(new Smartphone(
                "Iphone 12",
                40,
                new FastBootPowerOn()));

        devices.add(new Tablet(
                "Xiaomi Pad 8",
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
