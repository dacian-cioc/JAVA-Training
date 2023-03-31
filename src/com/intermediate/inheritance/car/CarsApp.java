package com.intermediate.inheritance.car;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("orange", (byte) 3, (short) 456, (short) 717, (short) 7700, 40000, 12000, true);
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();

        System.out.println("------------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte) 1, (short) 356, (short) 417, (short) 4700, 30000, 13000, false);
        blackToyotaSupra.getDescription();
        blackToyotaSupra.startTheEngine();
    }
}
