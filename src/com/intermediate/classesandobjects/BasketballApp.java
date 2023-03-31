package com.intermediate.classesandobjects;

public class BasketballApp {

    public static void main(String[] args) {
        BasketballPlayer kobe = new BasketballPlayer("Kobe", "Black", 1978, "Lakers",
                83.7, 25.0, 1346);
        BasketballPlayer jordan = new BasketballPlayer("Jordan", "NJ", 1963, "Chicago Bulls",
                83.5, 30.1, 1072);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson", "Magic", 1959, "Lakers",
                84.8, 19.5, 906);

        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers [0] = kobe;
        basketballPlayers [1] = jordan;
        basketballPlayers [2] = magic;

        for (BasketballPlayer basketballPlayer : basketballPlayers) {
            basketballPlayer.freeThrow();
        }
    }

}
