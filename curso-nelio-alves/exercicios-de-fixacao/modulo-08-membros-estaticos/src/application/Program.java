package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarValue = sc.nextDouble();
        System.out.println(dollarValue + "R$");

        System.out.println("How many dollars be bought:?");
        double buyDollar = sc.nextDouble();
        System.out.println(buyDollar + "R$");

        System.out.println("Amout to be paid in reais = " + CurrencyConverter.dollarConverter(dollarValue, buyDollar));

        sc.close();
    }
}