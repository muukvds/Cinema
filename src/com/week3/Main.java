package com.week3;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CinemaShop cinemaShop = new CinemaShop();
        cinemaShop.addDrinkSupplie(new DrinkSupply("Cola",1,15));
        cinemaShop.addDrinkSupplie(new DrinkSupply("Sinas",1,15));
        cinemaShop.addDrinkSupplie(new DrinkSupply("Bier",2,15));
        cinemaShop.addSnackSupplie(new SnackSupply("Popcorn",2,10));
        cinemaShop.addSnackSupplie(new SnackSupply("Snickers",1,10));
        cinemaShop.addSnackSupplie(new SnackSupply("Ijs",1,10));

        Cinema cinema = new Cinema();
        cinema.setCinemaShop(cinemaShop);
        cinema.getCinemaShop().printSupplies();

    }
}