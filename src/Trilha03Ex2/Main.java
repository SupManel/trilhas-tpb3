package Trilha03Ex2;

public class Main {
    public static void main(String[] args) {
        Banco cliente = new Banco(
                "andre",
                2123123,
                4120.25F
        );

        System.out.println("nome: " + cliente.nome + " numero da conta: " + cliente.numeroConta);
        System.out.println("saldo: " + cliente.saldo);
        if (cliente.saldo <= 0) {
            System.out.println("não pode sacar saldo inferior a 1 real");
        } else {
            System.out.println("pode sacar saldo superior a 1 real");
        }

    }
}