package ru.doublekdev;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        Currency currency = null;
        try {
            currency = new Currency();
        } catch (IOException e) {
            System.out.println("No internet connection!");
            //e.getMessage();
        }
        //System.out.println(currency.toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        currency.info();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(Currencies.USD+"= "+currency.getSalUSDCurrency());
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
