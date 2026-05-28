package edu.devicediagnostic;

public class FastBootPowerOn implements Powerable {

    @Override
    public void powerOn() {

        System.out.println("Fast boot activated");

    }
}