package aula02;

import java.util.Locale;
import java.util.Scanner;

public class ManipulacaoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String email = "email@gmail.com";

        System.out.println("Digite seu email: ");
        String novoEmail =
                input.nextLine()
                        .toLowerCase();


        // .trim é pra ignorar espaços antes e depois do digitado
        System.out.println(email
                .equals(novoEmail
                        .trim()));
    }
}
