package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        int id = 0;
        String name;
        double salary;
        double percentage = 0.0;

        Employee[] vect = new Employee[n];

        for (int i=0; i<vect.length; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: " );
            id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            System.out.println();
            vect[i] = new Employee(id, name, salary);
        }

        int increaseId = 0;
        boolean find = false;
        
        System.out.print("Enter the employee id that will have salary increase: ");
        increaseId = sc.nextInt();
        
        for (int i = 0; i<vect.length; i++) {
            if (increaseId == vect[i].getId()) {
                System.out.print("Enter the percentage: ");
                percentage = sc.nextDouble();
                System.out.println();
                find = true;
                break;
            }
        }

        if (find == false) {
            System.out.println("This id does not exist!");
            System.out.println();
        }

        System.out.println("List of employees: ");
        
        for (int i=0; i<vect.length; i++) {
            vect[i].percentage = percentage;
            if (vect[i].getId() == increaseId) {
                vect[i].setSalary(vect[i].increase() + vect[i].getSalary());
            }    
            System.out.println(vect[i].toString());
        }


        sc.close();
    }
}
