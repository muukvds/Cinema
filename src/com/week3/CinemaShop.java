package com.week3;

public class CinemaShop {

    private DrinkSupply[] drinkSupplies = new DrinkSupply[15];
    private SnackSupply[] snackSupplies = new SnackSupply[10];

    public void addDrinkSupplie(DrinkSupply drinkSupplie) {
        for(int i =0;1<drinkSupplies.length;i++)
        {
            if(drinkSupplies[i] != null)
            {
                drinkSupplies[i]=drinkSupplie;
                break;
            }
        }
    }

    public void addSnackSupplie(SnackSupply snackSupplie) {

        for(int i =0;1<snackSupplies.length;i++)
        {
            if(snackSupplies[i] != null)
            {
                snackSupplies[i]=snackSupplie;
                break;
            }
        }
    }

    public void printSupplies()
    {
        for (DrinkSupply drinkSupply:drinkSupplies) {
            drinkSupply.print();
        }
        for (SnackSupply snackSupply:snackSupplies) {
            snackSupply.print();
        }

    }
}
