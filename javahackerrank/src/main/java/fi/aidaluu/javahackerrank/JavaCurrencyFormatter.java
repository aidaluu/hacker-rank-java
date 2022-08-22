package fi.aidaluu.javahackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Java Currency Formatter
 *
 * @author aidaluu
 */
public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + nfUS.format(payment));
        Locale INDIA = new Locale("en", "IN");
        NumberFormat nfIN = NumberFormat.getCurrencyInstance(INDIA);
        System.out.println("India: " + nfIN.format(payment));
        NumberFormat nfCH = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nfCH.format(payment));
        NumberFormat nfFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nfFR.format(payment));
    }
    
}
