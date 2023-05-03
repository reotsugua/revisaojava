package aula02;

import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome completo: ");
        String nome = sc.nextLine();

        String[] nomeSeparado = nome.split(" ");
        for (int i = 0; i < nomeSeparado.length; i++) {
            System.out.print("!"+nomeSeparado[i]+" ");
        }
    }



}
