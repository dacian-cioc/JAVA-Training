package com.intermediate.polymorphism.car;

public class DodgeChallenger extends Car implements ElectricMode {


    public DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                           int price, int mileage, boolean isDamaged) {
      super(color, "Dodge Challenger", numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }


    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger engine is started.");
    }

    @Override
    public void startTheElectricEngine() {
        System.out.println("Dodge Challenger starts its electric engine.");
    }
}



