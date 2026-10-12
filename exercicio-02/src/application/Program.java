package application;
import entities.Employee;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee ep = new Employee();
        System.out.println("Qual seu nome?");
        ep.nome = sc.nextLine();

        System.out.println("Olá, " + ep.nome + "Qual seu salário?");
        ep.salario_bruto = sc.nextDouble();

        System.out.println(ep.nome + " qual o valor que veio de imposto na folha?");
        ep.imposto = sc.nextDouble();

        System.out.println(ep.nome + "seu salário liquido é de: " + ep.netSalary());


        sc.close();
    }
}
