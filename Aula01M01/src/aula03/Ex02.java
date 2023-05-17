package aula03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Boolean controle = true;
        do {
            System.out.println("Digite sua idade: ");
            Integer idade = scanner.nextInt();
            String voto = (idade >= 18 && idade <= 70)?
                "Voto obrigatório":
                (idade >= 16 && idade < 18 || idade >70)?"Voto  facultativo":"Sem direito a votar";

            System.out.println(voto);
            System.out.println("Fonte: https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade");
            scanner.nextLine();
            System.out.println("Verificar novamente? (S/N)");
            String continuar = scanner.nextLine().trim().toUpperCase();
            controle = (continuar.equals("S"));

        } while (controle);
    }
}
