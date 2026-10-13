package application;

import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main (String args []) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da largura?");
        rectangle.width = sc.nextDouble();
        System.out.println("LARGURA: " + rectangle.width);

        System.out.println("Qual o valor da altura?");
        rectangle.height = sc.nextDouble();
        System.out.println("ALTURA: " + rectangle.height);

        System.out.printf("AREA: %.2f%n", rectangle.area());

        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
        System.out.printf("PERIMETRO: %.2f%n", rectangle.perimeter());

        sc.close();
    }
}