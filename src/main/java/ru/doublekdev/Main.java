package ru.doublekdev;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Currency currency = new Currency();
        currency.info();
    }
}