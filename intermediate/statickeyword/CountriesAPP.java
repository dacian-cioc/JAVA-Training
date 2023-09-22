package com.intermediate.statickeyword;

public class CountriesAPP {

    public static void main(String[] args) {
        System.out.println("Number of countries " + Country.getNumberOfCountries());
        Country brazil = new Country("Brazil ", 210000000, "Brasilia");
        brazil.getDetails();
        Country germany = new Country("Germany ", 83000000, "Berlin");
        germany.getDetails();
        Country japan = new Country("Japan ", 1250000000, "Tokyo");
        japan.getDetails();
        System.out.println("Number of countries " + Country.getNumberOfCountries());


    }
}
