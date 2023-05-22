package util;

import javax.swing.plaf.PanelUI;

public class CurrencyConverter {

    public static final double DOLLAR = 3.10;

    public static double manyDollars;

    public static double Converter(){
        return manyDollars * (DOLLAR + DOLLAR * 6 /100);
    }



}
