package util;

public class CurrencyConverter {
    
    public double dollarValue;
    public double dollarBuy;

    public static double dollarConverter (double dollarValue, double dollarBuy) {
        double totalSemImposto = dollarValue * dollarBuy;
        double iof = totalSemImposto * 0.06;
        double total = iof + totalSemImposto;
        return total;
    }
}