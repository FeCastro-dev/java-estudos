package application;

import java.util.Scanner;
import entities.Rectangle;

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

        System.out.println("AREA: " + rectangle.area());

        System.out.println("DIAGONAL: " + rectangle.diagonal());
        System.out.println("PERIMETRO: " + rectangle.perimeter());

        sc.close();
    }
}