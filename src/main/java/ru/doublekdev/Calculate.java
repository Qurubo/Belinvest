package ru.doublekdev;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by qurub on 22.01.2017.
 */
public class Calculate {
    private double cur;
    private double BYN;
    private double need;
    private  void start() throws IOException {
        Currency currency = new Currency();
        cur = currency.getPurUSDCurrency();
        currency =null;
    }
    public void calc(){
        Scanner scr =new Scanner(System.in);
        try{
            start();
            String s = scr.nextLine();
            need = Double.parseDouble(s);
            if (need <= 0) {
                throw new CalculateException();
            }
        }catch (IOException e){
            System.out.println("No internet connection!");

        }catch (NumberFormatException e){
            System.out.println("Please, enter right number!");
            calc();
        }catch (CalculateException e){
            calc();
        }

    }

    public double getBYN() {
        return BYN;
    }
}
