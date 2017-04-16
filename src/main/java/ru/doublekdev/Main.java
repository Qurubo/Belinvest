package ru.doublekdev;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Calculate calculate =new Calculate(Currencies.USD);
        //System.out.println(Currencies.BYN+"= "+calculate.getBYN());
        JOptionPane.showMessageDialog(null,"Итого "+Currencies.BYN+" = "+calculate.getBYN());

    }
}
