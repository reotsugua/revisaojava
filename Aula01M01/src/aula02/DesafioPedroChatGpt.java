package aula02;

import java.util.Scanner;

public class DesafioPedroChatGpt {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");*/
        String nome = "Renan Augusto Santos";

        String nomeCompleto = adicionarDosNoNomeCompleto(nome);
        System.out.println("Nome completo: " + nomeCompleto);
    }

    public static String adicionarDosNoNomeCompleto(String nome) {
        String nomeCompleto = nome.trim(); // remover espaços em branco no início e fim do nome
        System.out.println("nomeCompleto = " + nomeCompleto);
        int posicaoUltimoEspaco = nomeCompleto.lastIndexOf(" ");
        System.out.println("posicaoUltimoEspaco = " + posicaoUltimoEspaco);
        if (posicaoUltimoEspaco >= 0) {
            String ultimoSobrenome = nomeCompleto.substring(posicaoUltimoEspaco + 1);
            System.out.println("ultimoSobrenome = " + ultimoSobrenome);
            if (!ultimoSobrenome.equalsIgnoreCase("dos")) {
                System.out.println("Primeira parte do nome: "+nomeCompleto.substring(0, posicaoUltimoEspaco + 1));
                nomeCompleto = nomeCompleto.substring(0, posicaoUltimoEspaco + 1) + "dos " + ultimoSobrenome;
            }
        }
        return nomeCompleto;
    }
}
