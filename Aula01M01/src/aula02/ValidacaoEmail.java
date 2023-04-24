package aula02;

import java.util.Arrays;
import java.util.Scanner;

public class ValidacaoEmail {
    public static void main(String[] args) {
        //Válidação de Email (xxx@xxx.xxx)
        Scanner input = new Scanner(System.in);

        String email = "email@gmail.com";

        String emailDepoisArroba = email.substring(email.indexOf("@"));

        System.out.println("Digite seu email: ");
        String novoEmail = "renan@gmail.com";
                //input.nextLine()
                      //  .toLowerCase();
        System.out.println("Contém @: " + novoEmail.contains("@"));
        System.out.println("Contém .: " + novoEmail.contains("."));
        System.out.println("Tamanho do email: " + novoEmail.length());
        System.out.println("Tamanho do email: " + (novoEmail.length()>=5));
        System.out.println("Validar antes do @: " + (novoEmail.indexOf("@")>0)); //Pra saber se tem coisa antes do @ (xxx@)
        System.out.println("emailDepoisArroba = " + emailDepoisArroba);
        System.out.println("Validar entre @ e o . : " + (emailDepoisArroba.indexOf(".")>1));
        System.out.println("Validar depois do . : " + (emailDepoisArroba.length()>emailDepoisArroba.indexOf(".")+1));


        /*if (novoEmail.matches("^[\\w\\.-]+@([\\w\\-]+\\.)+[a-z]{2,4}$")) {
            System.out.println("Endereço de email válido");
        } else {
            System.out.println("Endereço de email inválido");
        }*/





        // .trim é pra ignorar espaços antes e depois do digitado
        System.out.println(email
                .equals(novoEmail
                        .trim()));
    }
}
