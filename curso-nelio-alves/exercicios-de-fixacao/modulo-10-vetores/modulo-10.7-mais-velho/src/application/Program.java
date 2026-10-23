package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int idade = 0;
        String nome = "0";
        int quantidade = sc.nextInt();
        int n = 1;

        String nomes[] = new String[quantidade];
        int idades[] = new int[quantidade];
        
        for (int i=0; i<quantidade; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
        
        for (int i=0;i<quantidade; i++) {
            if (idades[i] > idade) {
                idade = idades[i];
                nome = nomes[i];
            }
        }

        System.out.println();
        System.out.print("PESSOA MAIS VELHA: " + nome);

        sc.close();
    }
}
