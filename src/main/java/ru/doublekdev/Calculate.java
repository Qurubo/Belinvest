package ru.doublekdev;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by qurub on 22.01.2017.
 */
public class Calculate {
    private double curUSD;
    private double curEUR;
    private double curRUB;
    private double BYN;
    private double need;
    private boolean b = false;

    public Calculate(Currencies currencies) {
        calc(currencies);
    }

    private  void start() throws IOException {
        Currency currency = new Currency();
        curUSD = currency.getSalUSDCurrency();
        curEUR = currency.getSalEURCurrency();
        curRUB = currency.getSalRUBCurrency();
        if(b==false){
            currency.info();
            System.out.println("\n");
        }
        b=true;
        currency =null;
    }
    private void calc(Currencies currencies){
        //Console
        //Scanner scr =new Scanner(System.in);
        try{
            start();
            //String s = scr.nextLine();
            String s = JOptionPane.showInputDialog(null,"Введите сумму","Currency USD",JOptionPane.NO_OPTION);
            need = Double.parseDouble(s);
            if (need <= 0 && need <=10000) {
                throw new CalculateException();
            }
        }catch (IOException e){
            System.out.println("No internet connection!");
        }catch (NumberFormatException e){
            System.out.println("Please, enter right number!");
            calc(currencies);
        }catch (CalculateException e){
            calc(currencies);
        }
        switch (currencies){
            case EUR:
                BYN=curEUR*need;
                break;
            case RUB:
                BYN=curRUB*need;
                break;
            case USD:
                BYN=curUSD*need;
                break;
        }
        BYN = BigDecimal.valueOf(BYN).setScale(2,BigDecimal.ROUND_CEILING).doubleValue();
    }
    public double getBYN() {
        return BYN;
    }
}
