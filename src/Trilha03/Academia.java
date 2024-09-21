package Trilha03;

public class Academia {
    public String nome;
    public Integer idade;
    public Float peso;
    public Float altura;


    public Academia(String nome, Integer idade, Float peso, Float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void IMC() {
        System.out.println("IMC do aluno: " + peso / Math.pow(altura,2));
    }

    public void Desconto() {
        if (idade <= 17) {
            System.out.println("Desconto aceito (menor de idade) " + this.idade + " anos");
        } else {
            System.out.println("Desconto negado (maior de idade) " + this.idade + " anos");
        }
    }
}