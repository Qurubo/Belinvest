package ru.doublekdev;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by qurub on 18.01.2017.
 */
class Currency {
    private double purUSDCurrency;
    private double purEURCurrency;
    private double purRUBCurrency;
    private double salUSDCurrency;
    private double salEURCurrency;
    private double salRUBCurrency;
    private String date;

    public Currency() throws IOException {
        Document doc = Jsoup.connect("https://ibank.belinvestbank.by/signin").get();
        Elements elDate = doc.getElementsByAttributeValue("class","date");
        Elements uCurrency = doc.getElementsByAttributeValue("data-currency","USD");
        Elements eCurrency = doc.getElementsByAttributeValue("data-currency","EUR");
        Elements rCurrency = doc.getElementsByAttributeValue("data-currency","RUB");
        date = elDate.get(0).text();
        purUSDCurrency = Double.parseDouble(uCurrency.get(0).text());
        salUSDCurrency = Double.parseDouble(uCurrency.get(1).text());
        purEURCurrency = Double.parseDouble(eCurrency.get(0).text());
        salEURCurrency = Double.parseDouble(eCurrency.get(1).text());
        purRUBCurrency = Double.parseDouble(rCurrency.get(0).text());
        salRUBCurrency = Double.parseDouble(rCurrency.get(1).text());
    }

    public double getPurUSDCurrency() {
        return purUSDCurrency;
    }

    public double getPurEURCurrency() {
        return purEURCurrency;
    }

    public double getPurRUBCurrency() {
        return purRUBCurrency;
    }

    public double getSalUSDCurrency() {
        return salUSDCurrency;
    }

    public double getSalEURCurrency() {
        return salEURCurrency;
    }

    public double getSalRUBCurrency() {
        return salRUBCurrency;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Currency{ " +
                "Date= '" + date+"' \n"+
                "purUSDCurrency=" + purUSDCurrency +
                ", salUSDCurrency=" + salUSDCurrency +"\n"+
                "purEURCurrency=" + purEURCurrency +
                ", salEURCurrency=" + salEURCurrency +"\n"+
                "purRUBCurrency=" + purRUBCurrency +
                ", salRUBCurrency=" + salRUBCurrency +
                " }";
    }

    public void info() {
        System.out.printf("%30s\n",date);
        System.out.printf("%10s %10s %10s\n","Валюта","Покупка","Продажа");
        System.out.printf("%10s %10.3f %10.3f\n","1 USD",purUSDCurrency,salUSDCurrency);
        System.out.printf("%10s %10.3f %10.3f\n","1 EUR",purEURCurrency,salEURCurrency);
        System.out.printf("%10s %10.3f %10.3f\n","100 RUB",purRUBCurrency,salRUBCurrency);
    }

}
