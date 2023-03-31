package com.beginner.operators;

public class OperatorsApp {
    public static void main(String[] args) {

        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": $" + price);

        int increasedPrice = price + 1000;
        System.out.println("The increased price of a " + carModel + ": $" + increasedPrice);
        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a " + carModel + ": $" + decreasedPrice);
        int twoCarsPrice = price * 2;
        System.out.println("Two " + carModel + ": $" + twoCarsPrice);
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.println("From the money we have in the back we can buy " + dodgesYouCanBuy + " " + carModel);
        int moneyRemaining = moneyInTheBank % price;
        System.out.println("Money we would remain after buying " + dodgesYouCanBuy + " " + carModel + ": $" + moneyRemaining);
        System.out.println();

        int priceNegative = 14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: $" + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign: $" + priceNegativeWithMinusSign);
        int priceOneEuroIncrease = ++price;
        System.out.println("Price after 1 euro price increase: $" + priceOneEuroIncrease);
        int priceOneEuroDecrease = --price;
        System.out.println("Price after 1 euro price decrease: $" + priceOneEuroDecrease);
        System.out.println("This car is damaged: " + !isDamaged);
        System.out.println();

        System.out.println("Car's price equals the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Car's price not equals the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Car's price greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Car's price lesser than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Car's price greater than or equals the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Car's price lesser than or equals the money in the bank: " + (price <= moneyInTheBank));
        System.out.println("The carModel variable's datatype is a string: " + (carModel instanceof String));
        System.out.println();

        String damagedText = isDamaged ?"The car is damaged" : "The car is not damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingText = !isDamaged || price <= 20000 ?"It's worth seeing" : "It's not worth seeing";
        System.out.println(worthSeeingText);
        String worthRepairing = isDamaged && price <= 10000 ?"It's worth repairing" : "It's not worth repairing";
        System.out.println(worthRepairing);
        System.out.println();

        price += 1000;
        System.out.println("Price increased: $" + price);
        price -= 2000;
        System.out.println("Price decreased: $" + price);
        price *= 2;
        System.out.println("Price multiplied: $" + price);
        price /= 2;
        System.out.println("Price divided: $" + price);
        price %= 10000;
        System.out.println("Price remained: $" + price);




    }
}
