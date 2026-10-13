package entities;

public class Employee {
    
    public String nome;
    public double salario_bruto;
    public double imposto;

    public double netSalary() {
        
        double salario_liquido = salario_bruto - imposto;
        return salario_liquido;

    }

    public void increaseSalary(double percentage) {

        double aumentoSalario =  percentage * (salario_bruto / 100);
        salario_bruto = salario_bruto + aumentoSalario;
    }   

}
