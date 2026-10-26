package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        String name[] = new String[n];
        String email[] = new String[n];
        int room[] = new int[n];

        Pensionato[] vect = new Pensionato[n];
        

        for (int i=0; i<n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Email: ");
            email[i] = sc.next();
            System.out.print("Room: ");
            room[i] = sc.nextInt();
        }
        sc.close();
    }
}
