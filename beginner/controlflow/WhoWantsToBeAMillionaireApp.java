package com.beginner.controlflow;

public class WhoWantsToBeAMillionaireApp {
    public static void main(String[] args) {
        char millionaireAnswer = 'C';


        System.out.println("Who is named as the father of the light bulb?");
        System.out.println("you marked " + millionaireAnswer + ". Let's see if you are right!");

        if (millionaireAnswer == 'C') {
            System.out.println("u were right");
        } else {
            System.out.println("sorry, answer is tomas edison");
        }

    }
}
