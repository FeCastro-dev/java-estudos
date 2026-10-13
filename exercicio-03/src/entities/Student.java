package entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade() {
        double somaNotas = nota1 + nota2 + nota3;
        return somaNotas;
    }

    public double missing () {
        double diferenca = 60 - finalGrade();
        return diferenca;
    }
}
