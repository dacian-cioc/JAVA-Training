package com.intermediate.polymorphism.car;

public class ToyotaSupra extends Car {
    public ToyotaSupra(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
        super(color, "Toyota Supra", numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A Toyota Supra engine is started.");
    }
}
