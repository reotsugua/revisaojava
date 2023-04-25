package fiap;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int são iniciados com 0
        //boolean é falso e objeto é null.
        int[] not = new int[40];
        int[] notass = {9,10,8,2};
        int[] nums = new int[]{9,10,8,2};
        /*O resultado das declarações acima é igual ao resultado abaixo:
        int notas[] = new int[4];
        notas[0] = 10;
        notas[1] = 9;
        notas[2] = 8;
        notas[3] = 2;
        notas[0] = 10
        ;*/
        System.out.println("notas[0] = " + not[0]);
        Scanner sc = new Scanner(System.in);
        float notas[] = new float[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno");
            notas[i] = sc.nextFloat();
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);

        }
        // Calculara média dos alunos
        float totalNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            totalNotas = totalNotas + notas[i];
        }
        float mediaNotas = totalNotas/notas.length;
        System.out.println("A média dos alunos é " + mediaNotas);
        sc.close();

    }
}
