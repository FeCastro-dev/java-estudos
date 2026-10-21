package applicatiion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);    

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int vect [] = new int[n];

        

        sc.close();
    }
}