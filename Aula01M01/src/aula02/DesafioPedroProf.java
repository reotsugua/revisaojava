package aula02;

public class DesafioPedroProf {
    public static void main(String[] args) {
        String nome = "Pedro Bomfim Costa";

        String[] parteNome = nome.split(" ");
        parteNome [1] += " da";

        //nome = String.join(" ", parteNome); // Junta o array e coloca o Delimitador entre os itens do Array

        nome = nome.replace("Bomfim", "Bomfim da");

        System.out.println("nome = " + nome);

        System.out.println(String.join(",", "Pedro", "Marcus", "João", "Ana"));
    }
}
