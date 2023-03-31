package com.beginner.endsection;

public class IMDBApp {
    public static void main(String[] args) {
        String actorName = "Keanu Reeves";
        int yearBirth = 1964;
        int age = 2023 - yearBirth;


        String [] movieTitles= {
                "John Wick", "Constantine", "Matrix",
                "Lone House", "John wick 2", "John wick 3", "John wick 4"
        };

        float [] movieRatings = {
                7.7F, 7.6F, 6.9F,
                8.0F, 8.9F, 5.4F, 4.3F
        };

        System.out.println("Actor's name: " + actorName);
        System.out.println("Born: " + yearBirth + " (" + age + " years old)");
        System.out.println();
        System.out.println("Movies");

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " - " + getRating(movieRatings[i]));

        }
    }

    static String getRating(float rating){
        if (rating <= 5.0) {
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5) {
                return "average";
        } else if (rating > 6.5 && rating <= 7.0) {
                return "good";
        } else if (rating > 7.0 && rating <= 8.5) {
                return "very good";
            }else {
            return "amazing";
        }
    }

}
