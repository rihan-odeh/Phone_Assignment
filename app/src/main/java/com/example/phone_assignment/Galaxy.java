package com.example.phone_assignment;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String displayInfo() {
        return "galaxy " + getVersionNumber() + " from " + getCarrier();

    }

    @Override
    public String ring() {
        return "Galaxy says "+ getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlocking via fingerprint";
    }
}
