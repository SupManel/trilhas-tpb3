package Trilha03Ex2;

public class Banco {
    public String nome;
    public Integer numeroConta;
    public Float saldo;

    public Banco(String nome, Integer numeroConta, Float saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("saldo: " + this.saldo);
    }

}