package entities;

public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    private int taxa = 5;

    public double deposito;
    public double saque;
    


    public ContaBancaria (int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public double aumentarSaldo(double deposito) {
        this.saldo = saldo += deposito;
        return this.saldo;
    }

    public double diminuirSaldo(double saque) {
        this.saldo = this.saldo - saque - taxa;
        return this.saldo;
    }

    

}