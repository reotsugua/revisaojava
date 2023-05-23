package aula03;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "renan";
        int tentativasMaximas = 6;
        int tentativas = 0;
        boolean[] letrasEncontradas = new boolean[palavraSecreta.length()];


        while (true) {
            exibirBoneco(tentativas);
            exibirPalavraEscondida(palavraSecreta, letrasEncontradas);

            System.out.print("Digite uma letra: ");
            String entrada = scanner.nextLine();
            char letra = entrada.charAt(0);

            boolean acertou = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    letrasEncontradas[i] = true;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas++;
                System.out.println("Letra incorreta! Tentativas restantes: " + (tentativasMaximas - tentativas));
            }

            if (tentativas == tentativasMaximas) {
                exibirBoneco(tentativas);
                System.out.println("Você perdeu! A palavra secreta era: " + palavraSecreta);
                break;
            }

            if (palavraRevelada(palavraSecreta, letrasEncontradas)) {
                System.out.println("Parabéns! Você acertou a palavra secreta: " + palavraSecreta);
                break;
            }
        }

        scanner.close();
    }

    public static void exibirPalavraEscondida(String palavra, boolean[] letrasEncontradas) {
        for (int i = 0; i < palavra.length(); i++) {
            if (letrasEncontradas[i]) {
                System.out.print(palavra.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public static boolean palavraRevelada(String palavra, boolean[] letrasEncontradas) {
        for (boolean encontrada : letrasEncontradas) {
            if (!encontrada) {
                return false;
            }
        }
        return true;
    }

    public static void exibirBoneco(int tentativas) {
        switch (tentativas) {
            case 0:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("===========");
                break;
            case 1:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("===========");
                break;
            case 2:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |       |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("===========");
                break;
            case 3:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      \\|");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("===========");
                break;
            case 4:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      \\|/");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("===========");
                break;
            case 5:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      \\|/");
                System.out.println(" |      /");
                System.out.println(" |");
                System.out.println("===========");
                break;
            case 6:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      \\|/");
                System.out.println(" |      / \\");
                System.out.println(" |");
                System.out.println("===========");
                break;
        }
    }
}
