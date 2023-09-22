package com.intermediate.abstraction.athlete;

public class Swimmer extends Athlete implements Swimming{

    private int finaPoints;
    public Swimmer(String name, String nickname, int yearOfBorn, String team,int finaPoints, int numberOfCompetitions) {
        super(name, nickname, yearOfBorn, team, numberOfCompetitions);
        this.finaPoints = finaPoints;
    }

    @Override
    public String getBodyType() {
        return "Lean muscle, long torso and flexible ankles.";
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("FINA points: " + finaPoints);
    }

    @Override
    public void freeStyle() {
        System.out.println("Swimming freestyle very fast.");
    }

    @Override
    public void compete() {
        super.compete();
        freeStyle();
    }
}
