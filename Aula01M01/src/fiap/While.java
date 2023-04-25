package fiap;

public class While {
    public static void main(String[] args) {
        /*
        O loop WHILE executa um bloco de código
        enquanto a condição for VERDADEIRA
        ESTRUTURA
            while (condição) {
                Instruções
            }

        O loop é testado na parte inicial, antes que seja executada
        a primeira iteração
        */

        int numero = 0;
        while (numero < 10){
            numero = numero + 1;
            System.out.println(numero);
        }
    }
}
