package aula03;

import java.util.Scanner;

public class Funcoes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean controle;

        do {
            System.out.println("Digite o 1º Número: ");
            Double n1 = sc.nextDouble();
            System.out.println("Digite o 2º Número: ");
            Double n2 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Informe qual operação quer realizar: (+, -, /, *)");
            String operacao = sc.nextLine().trim();

            switch (operacao){
                case "+" -> System.out.println(somaValores(n1,n2));
                case "-" -> System.out.println(subtrairValores(n1, n2));
                case "/" -> System.out.println(dividirValores(n1, n2));
                case "*" -> System.out.println(multiplicarValores(n1, n2));
                default -> System.out.println("Operação inválida");

            }
            System.out.println("Deseja outro valor? (S/N)");
            String escolha = sc.nextLine();
            controle = escolha.toLowerCase().equals("s")?true:false;


        } while (controle);
        sc.close();
        System.out.println("finalizado");


    }

    public static Double multiplicarValores(Double n1, Double n2) {
        return n1 * n2;
    }

    public static Double dividirValores(Double n1, Double n2) {
        return n1 / n2;
    }

    public static Double subtrairValores(Double n1, Double n2) {
        return n1 - n2;
    }

    public static Double somaValores(Double n1, Double n2){
        return n1 + n2;

    }


}
