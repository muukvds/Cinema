package com.week3;

public class CinemaShop {

    private DrinkSupply[] drinkSupplies = new DrinkSupply[15];
    private SnackSupply[] snackSupplies = new SnackSupply[10];

    public void addDrinkSupplie(DrinkSupply drinkSupplie) {
        for (int i = 0; i < drinkSupplies.length; i++) {
            if (drinkSupplies[i] == null) {
                drinkSupplies[i] = drinkSupplie;
                break;
            }
        }
    }

    public void addSnackSupplie(SnackSupply snackSupplie) {

        for (int i = 0; i < snackSupplies.length; i++) {
            if (snackSupplies[i] == null) {
                snackSupplies[i] = snackSupplie;
                break;
            }
        }
    }

    public void printSupplies() {
        System.out.println("CinemaShop voorraad:");
        for (DrinkSupply drinkSupply : drinkSupplies) {
            if (drinkSupply != null) {

                drinkSupply.print();
            } else {
                break;
            }
        }
        for (SnackSupply snackSupply : snackSupplies) {
            if (snackSupply != null) {
                snackSupply.print();
            } else {
                break;
            }
        }


    }
}
