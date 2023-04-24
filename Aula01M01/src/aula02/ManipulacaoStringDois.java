package aula02;

import java.util.Scanner;

public class ManipulacaoStringDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.println("nome = " + nome);

        String primeiraLetra = nome.substring(0,1);
        System.out.println("primeiraLetra = "+primeiraLetra);
        
        String restoNome = nome.substring(1);
        System.out.println("restoNome = " + restoNome);
        
        String nomeFomatado = primeiraLetra.toUpperCase()+restoNome;
        System.out.println("nomeFormatado = " + nomeFomatado);
    }
}
