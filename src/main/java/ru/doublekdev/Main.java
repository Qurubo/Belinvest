package ru.doublekdev;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Currency currency = new Currency();
        //System.out.println(currency.toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        currency.info();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("USD= "+currency.getSalUSDCurrency());
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
