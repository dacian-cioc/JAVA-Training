package com.intermediate.endsection;

public class City {
    private Building[] buildings = new Building[4];

    public City() {
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter opener", 1.5);
        bankItems[1] = new Item("Stamp", 2.5);
        buildings[0] = new Building("Bank", bankItems);

        Item[] mansionItems = new Item[2];
        mansionItems[0] = new Item("Pair of fancy shoes", 25);
        mansionItems[1] = new Item("Broken glass", 0.1);
        buildings[1] = new Building("Mansion", bankItems);

        Item[] postOffice = new Item[2];
        postOffice[0] = new Item("Letter to Jenny", 1.5);
        postOffice[1] = new Item("Pencil", 2.0);
        buildings[2] = new Building("PostOffice", bankItems);

        Item[] supermarketItems = new Item[2];
        supermarketItems[0] = new Item("A loaf of bread", 2.5);
        supermarketItems[1] = new Item("A bag of tea", 6.5);
        buildings[3] = new Building("Supermarket", bankItems);

    }

    public Building[] getBuildings() {
        return buildings;
    }
}
