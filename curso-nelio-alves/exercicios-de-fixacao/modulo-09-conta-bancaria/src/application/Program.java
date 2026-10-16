package application;

import entities.ContaBancaria;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    
        
        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println(numeroConta);

        System.out.print("Enter account holder: ");
        String nomeTitular = sc.nextLine();
        System.out.println(nomeTitular);     

        //if else
        System.out.println("Is there na initial deposit (y/n)? ");
        String answer = sc.next();
        if (answer.equals("y")) {
            System.out.println("Enter initial deposit value: ");
        }
        
        double deposito = sc.nextDouble();
        
        double saldo = 0 + deposito;        
        System.out.println(saldo);
        
        ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Account data:");
        System.out.println("Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + saldo);

        System.out.print("Enter a deposit value: ");
        cb.deposito = sc.nextDouble();
        
        System.out.println("Updated account data: ");
        System.out.println("Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + cb.aumentarSaldo(cb.deposito));

        System.out.print("Enter a withdraw value: ");
        cb.saque = sc.nextDouble();

        System.out.println("Updated account data: ");
        System.out.println("Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + cb.diminuirSaldo(cb.saque));

        sc.close();
    }
}
