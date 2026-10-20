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
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        boolean tituloExibido = false;

        for (int i=0; i<n; i++) {
            if (vect[i] < 0) {
                if(tituloExibido == false) {
                    tituloExibido = true;
                    System.out.println("NUMEROS NEGATIVOS: ");
                }    
                System.out.println(vect[i]);
            }    
        }

        sc.close();
    }
}
