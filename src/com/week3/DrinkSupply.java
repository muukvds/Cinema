package com.week3;

public class DrinkSupply {
    private String name;
    private int price;
    private int supply;

    public DrinkSupply(String name, int price, int supply) {
        this.name = name;
        this.price = price;
        this.supply = supply;
    }

    public void print()
    {
        System.out.println(name +" - voorraad " + supply+", prijs: "+ price);
    }
}
