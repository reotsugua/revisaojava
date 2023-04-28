package aula02;

public class Ex01ChatGpt {
    public static void main(String[] args) {
        String frase = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";

        String[] meses = frase.split(", "); // separa a frase em uma lista de meses

        int total = 0; // variável para armazenar o total dos meses

        for (String mes : meses) {
            String[] dados = mes.split(": "); // separa o nome do mês do valor

            String nomeMes = dados[0]; // armazena o nome do mês
            int valorMes = Integer.parseInt(dados[1]); // converte o valor do mês para inteiro

            System.out.println(nomeMes + ": " + valorMes); // imprime o nome e valor do mês

            total += valorMes; // adiciona o valor do mês ao total
        }

        System.out.println("Total: " + total); // imprime o total dos meses
    }
}

