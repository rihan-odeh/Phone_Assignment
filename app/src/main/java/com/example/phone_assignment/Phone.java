package com.example.phone_assignment;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public abstract String displayInfo();

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getRingTone() {
        return ringTone;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setRingTone(String ringTone) {
        this.ringTone = ringTone;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "versionNumber='" + versionNumber + '\'' +
                ", batteryPercentage=" + batteryPercentage +
                ", carrier='" + carrier + '\'' +
                ", ringTone='" + ringTone + '\'' +
                '}';
    }
}
