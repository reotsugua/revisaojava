package aula03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Boolean controle = false;
        do {
            System.out.println("""
                Selecione uma opção abaixo:
                1 - Coca-Cola - R$ 5,00
                2 - Coca-Cola 0 - R$ 4,50
                3 - Pepsi - R$ 4,40
                4 - Guaraná Antarctica - R$ 3,50
                5 - Fanta Laranja - R$ 4,23
                6 - Água - R$ 2,50"""
            );
            Integer escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha){
                case 1 -> System.out.println("Você escolheu Coca-Cola - R$ 5,00");
                case 2 -> System.out.println("Você escolheu Coca-Cola 0 - R$ 4,50");
                case 3 -> System.out.println("Você escolheu Pepsi - R$ 4,40");
                case 4 -> System.out.println("Você escolheu Guaraná Antarctica - R$ 3,50");
                case 5 -> System.out.println("Você escolheu Fanta Laranja - R$ 4,23");
                case 6 -> System.out.println("Você escolheu Água - R$ 2,50");
                default -> System.out.println("Opção Inválida, tente novamente!");
            }

            System.out.println("Deseja continuar: (S/N)");
            String continuar = scanner.nextLine().trim().toUpperCase();
            controle = (continuar.equals("S"));

        } while (controle);

    }
}
