package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        Employee ep = new Employee();

        for (int i=0; i<n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: " );
            id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Salary: ");
            salary = sc.nextDouble();
        }

        sc.close();
    }
}
