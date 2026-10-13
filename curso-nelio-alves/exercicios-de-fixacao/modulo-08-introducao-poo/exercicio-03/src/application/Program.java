package application;
import entities.Student;
import java.util.Scanner;


public class Program {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        
        System.out.println("Olá aluno, qual seu nome?");
        st.nome = sc.nextLine();

        System.out.println(st.nome + ", vamos calculr sua nota final. Me informe sua primeira nota, por favor.");
        st.nota1 = sc.nextDouble();
        
        System.out.println("Me informa a segunda nota, por favor.");
        st.nota2 = sc.nextDouble();

        System.out.println("Me informa a terceira nota, por favor.");
        st.nota3 = sc.nextDouble();

        System.out.println("Obrigado pelas notas, irei calcular.");
        System.out.println("A soma das suas notas são: " + st.finalGrade());

        if (st.finalGrade() >= 60) {
            System.out.println("FINAL GRADE = " + st.finalGrade());
            System.out.print("PASS");
        } else {
            System.out.println("FINAL GRADE = " + st.finalGrade());
            System.out.println("FAILED");
            System.out.print("MISSING: " + st.missing() + " POINTS");
        }
        
        
        sc.close();
    }
}