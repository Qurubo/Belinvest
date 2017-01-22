package ru.doublekdev;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        Calculate calculate;
        try {
            calculate = new Calculate();
        } catch (IOException e) {
            System.out.println("No internet connection!");
        }

    }
}
