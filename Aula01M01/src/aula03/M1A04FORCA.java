package Exercicios;

import java.util.Scanner;

public class M1A04FORCA {
    static Scanner input = new Scanner(System.in);
    static String palavraSecreta = "";
    static String letraUsada = "";
    static String palavaAdivinhada = "";
    static Integer tentativas;


    public static void main(String[] args) {
        System.out.printf("JOGO da FORCA\n");
        System.out.printf("Insira quantas tentativas seu adversário: \n");
        tentativas = input.nextInt();
        input.nextLine();
        System.out.printf("Escolha uma palavra secreta para o seu adversário: \n");
        palavraSecreta = input.nextLine();

        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavaAdivinhada += "_";

            for (int chances = 0; ; chances++) {
                if (chances == tentativas) {
                    System.out.printf("Tentativas esgotadas, a palavra secreta era %s ", palavraSecreta);
                    System.exit(0);
                }

                System.out.printf("Rodada %d\n" +
                        " %s\n" +
                        " Digite uma letra:\n", chances, palavaAdivinhada);

                char letraTentada = input.next().charAt(0);
                if (letraUsada.indexOf(letraTentada) >= 0){
                    System.out.printf("Você ja tentou a letra '%c'\n Digite uma letra diferente\n" +
                            "", letraTentada);
                } else {
                    letraUsada += letraTentada;

                    if (palavraSecreta.indexOf(letraTentada) >= 0) {
                        palavaAdivinhada = "";

                        for (int j = 0; j < palavraSecreta.length(); j++) {
                            palavaAdivinhada += letraUsada.indexOf(palavraSecreta.charAt(j)) >= 0
                                    ? palavraSecreta.charAt(j) : "_";
                        }

                        if (palavaAdivinhada.contains("_")) {
                            System.out.printf("Acertou! '%s' existe na palavra secreta.\n Continue...\n", letraTentada);
                        } else {
                            System.out.printf("Parabéns você ganhou!\n A palavra secreta era '%s'.", palavraSecreta);
                            System.exit(0);
                        }

                    } else {
                        System.out.printf("A letra %c não existe", letraTentada);
                    }
                }


            }
        }


    }
}
