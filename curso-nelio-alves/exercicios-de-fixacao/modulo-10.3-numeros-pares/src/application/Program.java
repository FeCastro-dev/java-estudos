package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);    

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int vect[] = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um núemro: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();


        int sum  = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i=0; i<n; i++) {
            if (vect[i]%2 == 0) {
                System.out.print(vect[i] + " ");

                sum++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("QUANTIDADE DE PARE = " + sum);

        sc.close();
    }
}