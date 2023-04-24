package aula02;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioPedro {
    public static void main(String[] args) {
        String nomeUsuario = "Pedro Bomfim Costa";

        System.out.println(Arrays.toString(nomeUsuario.split(" ")));
        String primeiroNome = nomeUsuario.split(" ")[0];
        System.out.println("primeiroNome = " + primeiroNome);
        String segundoNome = nomeUsuario.split(" ")[1];
        System.out.println("segundoNome = " + segundoNome);
        String terceiroNome = nomeUsuario.split(" ")[2];
        System.out.println("terceiroNome = " + terceiroNome);
        
        String nomeCompleto = primeiroNome+" "+segundoNome+" da "+terceiroNome;
        System.out.println("nomeCompleto = " + nomeCompleto);


    }
}
