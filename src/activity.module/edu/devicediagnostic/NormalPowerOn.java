package edu.devicediagnostic;

public class NormalPowerOn implements Powerable {

    @Override
    public void powerOn() {

        System.out.println("Powering on");

    }
}