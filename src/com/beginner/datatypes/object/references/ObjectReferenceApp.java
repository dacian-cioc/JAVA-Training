package com.beginner.datatypes.object.references;

public class ObjectReferenceApp {

    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsepower = 392;
        Integer price = 29999;
        Long registrationNumber = 238712743L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.2313243;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Price: $" + price.floatValue());
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined);
        System.out.println("Precised fuel consumption: " + fuelConsumptionPrecise.intValue());
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy Efficiency category: " + energyEfficiencyCategory);
        System.out.println("The car model uppercase: " + carModel.toUpperCase());
        System.out.println("The car model lowercase: " + carModel.toLowerCase());
        System.out.println("Car model and car model with new keyword are equal: " + carModel.equals(carModelNew));
        System.out.println("The car model with new keyword: " + carModelNew);


    }
}
