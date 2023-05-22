package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? %.2f", CurrencyConverter.DOLLAR);
        System.out.println();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.manyDollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.Converter());
    }
}
