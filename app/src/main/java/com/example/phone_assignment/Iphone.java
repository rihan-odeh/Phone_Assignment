package com.example.phone_assignment;

public class Iphone extends Phone implements Ringable{

    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String displayInfo() {
        return "iphone " + getVersionNumber() + " from " + getCarrier();
    }

    @Override
    public String ring() {
        return "iphone says "  + getRingTone();
    }

    @Override
    public String unlock() {
        return "unlocking via facial recognition";
    }
}
