package aula03;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua faixa de idade: ");
        String tipoIdade = sc.nextLine();

        /*switch (tipoIdade){
            case "criança":
                System.out.println("Você é uma criança");
                break;
            case "adolescente":
                System.out.println("Você é uma adolescente");
                break;
            case "adulto":
                System.out.println("Você é uma adulto");
                break;
            case "idoso":
                System.out.println("Você é um idoso");
                break;
            default:
                System.out.println("Você é um E.T.");

        }*/
        switch (tipoIdade){
            case "criança" ->
                System.out.println("Você é uma criança");
            case "adolescente" ->
                System.out.println("Você é uma adolescente");
            case "adulto" ->
                System.out.println("Você é uma adulto");
            case "idoso" ->
                System.out.println("Você é um idoso");
            default -> {
                System.out.println("Você é um E.T.");
                System.out.println("Você errou");
            }

        }

        Integer num = tipoIdade.equals("criança")? 10 : 20;
        System.out.println(num);
    }
}
