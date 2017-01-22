package ru.doublekdev;

/**
 * Created by qurub on 22.01.2017.
 */
public class CalculateException extends RuntimeException {
    public CalculateException() {

        System.out.println("Please enter number between 0 - 10000");
    }
}
