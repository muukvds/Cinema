package com.week3;

public class SnackSupply {
    private String name;
    private int price;
    private int supply;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    public void print()
    {
        System.out.println(name +" - voorraad " + supply+", prijs: "+ price);
    }
}
