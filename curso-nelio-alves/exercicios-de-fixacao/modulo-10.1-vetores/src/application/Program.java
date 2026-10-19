package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        
        while (n > 10 || n <= 0) {
            System.out.println("Favor digite um número menor que 10.");
            n = sc.nextInt();
        } 
        
        int [] vect = new int[n];

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextInt();
            

        }

        sc.close();
    }
}
