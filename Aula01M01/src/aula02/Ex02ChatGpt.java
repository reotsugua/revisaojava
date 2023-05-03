package aula02;

import java.util.Scanner;

public class Ex02ChatGpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] partes = nomeCompleto.split(" "); // separa o nome completo em partes

        String resultado = "!"; // inicia a string com o símbolo de exclamação

        for (String parte : partes) {
            resultado += parte.substring(0, 1).toUpperCase() + parte.substring(1).toLowerCase() + " "; // adiciona a parte com a primeira letra maiúscula e as demais minúsculas
        }

        System.out.println(resultado.trim()); // imprime o resultado final
    }
}
