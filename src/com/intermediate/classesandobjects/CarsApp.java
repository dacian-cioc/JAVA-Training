package com.intermediate.classesandobjects;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("orange", (byte) 3, (short) 456, (short) 717, (short) 7700, 40000, 12000, true);
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();

        System.out.println("------------------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte) 1, (short) 392, (short) 492, (short) 6700, 30000, 10000, false);
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();

    }
}
