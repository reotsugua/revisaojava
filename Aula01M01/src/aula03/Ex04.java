package aula03;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Selecione uma das opções:
                1 - Coca-Cola - R$ 5,00
                2 - Coca-Cola 0 - R$ 4,50
                3 - Pepsi - R$ 4,40
                4 - Guaraná Antarctica - R$ 3,50
                5 - Fanta Laranja - R$ 4,23
                6 - Água - R$ 2,50"""
        );

        String escolha = scanner.nextLine().trim();

        if (escolha.equals("1")) {
            System.out.println("Coca-Cola - R$ 5,00");
        } else if (escolha.equals("2")) {
            System.out.println("Coca-Cola 0 - R$ 4,50");
        } else if (escolha.equals("3")) {
            System.out.println("Pepsi - R$ 4,40");
        } else if (escolha.equals("4")) {
            System.out.println("Guaraná Antarctica - R$ 3,50");
        } else if (escolha.equals("5")) {
            System.out.println("Fanta Laranja - R$ 4,23");
        } else if (escolha.equals("6")) {
            System.out.println("Água - R$ 2,50");
        } else {
            System.out.println("Opção inválida!");
        }


    }
}
