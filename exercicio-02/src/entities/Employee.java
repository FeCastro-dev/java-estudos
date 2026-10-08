package entities;

public class Employee {
    
    String nome;
    double salario_bruto;
    double imposto;

    public double netSalary() {
        
        double salario_liquido = salario_bruto - imposto;
        return salario_liquido;

    }

    public void increaseSalary(double percentage) {

        double aumentoSalario =  * (salario_bruto / 100);
    }

}
