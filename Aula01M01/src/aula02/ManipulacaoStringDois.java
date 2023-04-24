package aula02;

import java.util.Scanner;

public class ManipulacaoStringDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = input.nextLine().toLowerCase();

        System.out.println("nome = " + nome);

        //String primeiraLetra = nome.substring(0,1);
        Character primeiraLetra = nome.toUpperCase().charAt(0);
        System.out.println("primeiraLetra = "+primeiraLetra);
        
        String restoNome = nome.substring(1);
        System.out.println("restoNome = " + restoNome);
        
        //String nomeFomatado = primeiraLetra.toUpperCase()+restoNome;
        String nomeFomatado = primeiraLetra+restoNome;
        System.out.println("nomeFormatado = " + nomeFomatado);

        System.out.println(nome.isEmpty());//nulo
        System.out.println(nome.isBlank());//vazio
    }
}
