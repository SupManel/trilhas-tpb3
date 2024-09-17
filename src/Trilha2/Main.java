package Trilha2;

public class Main {
    public static void main(String[] args) {
        // sem uso de instancia de classe
        Pessoa Einstein = new Pessoa();
        Einstein.nome = "Albert Einstein";

        Pessoa Newton = new Pessoa();
        Newton.nome = "Isaac Newton";

        Universidade Princeton = new Universidade();
        Princeton.nomeUNI = "Princeton";
        Princeton.local = "Nova Jersey - Estados Unidos da América";

        Universidade Cambridge = new Universidade();
        Cambridge.nomeUNI = "Cambridge";
        Cambridge.local = "Cambridge - Reino Unido";

        System.out.println(Einstein.nome + " trabalhou como professor de física em " + Princeton.nomeUNI + " " + "("+Princeton.local+")");
        System.out.println(Newton.nome + " trabalhou como professor de matemática em " + Cambridge.nomeUNI + " " + "("+Cambridge.local+")");
    }
}