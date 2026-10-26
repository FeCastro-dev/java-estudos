package application;

import entities.Pensionato;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Pensionato[] vect = new Pensionato[10];
        

        for (int i=0; i<vect.length; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Pensionato(room, name, email);
        }
        
        /*System.out.print("Busy rooms: ");
        for (int i=0; i<vect.length; i++) {
            System.out.print(vect);
        }*/
        
        sc.close();
    }
}
