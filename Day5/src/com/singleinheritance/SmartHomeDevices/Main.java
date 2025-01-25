package com.singleinheritance.SmartHomeDevices;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH123", "Online", 22);
        thermostat.displayStatus();
    }

}
