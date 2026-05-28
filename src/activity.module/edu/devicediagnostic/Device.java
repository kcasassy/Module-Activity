package edu.devicediagnostic;

public abstract class Device {

    private String name;
    private int batteryLevel;
    private Powerable powerBehavior;

    public Device(String name, int batteryLevel, Powerable powerBehavior) {

        this.name = name;
        this.batteryLevel = batteryLevel;
        this.powerBehavior = powerBehavior;

    }

    public String getName() {
        return name;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public Powerable getPowerBehavior() {
        return powerBehavior;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerBehavior(Powerable powerBehavior) {
        this.powerBehavior = powerBehavior;
    }

    public abstract void runDiagnostics();

    public void showStatus() {

        System.out.println("Device: " + name);
        System.out.println("Battery Level: " + batteryLevel + "%");

    }
}