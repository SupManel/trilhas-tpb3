package Trilha03;

public class Main {
    public static void main(String[] args) {
        /* atividade 02 trilha 03
        Banco cliente = new Banco(
                "emanuel",
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
        */
        Academia aluno = new Academia(
                "emanuel", 17, 71.23F, 1.75F
        );
        System.out.println("nome: " + aluno.nome +" idade: " + aluno.idade + " peso: " + aluno.peso + " altuta: " + aluno.altura);
        aluno.IMC();
        aluno.Desconto();

    }
}