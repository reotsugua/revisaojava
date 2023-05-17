package aula03;

import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Voto  facultativo");
        } else if (idade >= 18) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Sem direito a votar");
        }
        System.out.println("\nFonte: https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade");
    }
}
