package com.intermediate.defaultvalues;

public class Car {
    private byte numberOfSeats;
    private short horsePower;
    private int price;
    private long registrationNumber;

    private float fuelConsumption;
    private double preciseFuelConsumption;

    private boolean isDamaged;
    private char energyEfficiencyCategory;
    private String color;

    private Boolean hasElectricEngine;
    private Engine engine;

    public void getDetails() {
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsePower);
        System.out.println("Price: " + price);
        System.out.println("Registration number:" + registrationNumber);
        System.out.println("Fuel Consumption: " + fuelConsumption);
        System.out.println("Precise fuel consumption: " + preciseFuelConsumption);
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);
        System.out.println("Color of the car: " + color);
        System.out.println("Has electric engine: " + hasElectricEngine);
        System.out.println("The engine this care has is: " + engine);
    }
}
