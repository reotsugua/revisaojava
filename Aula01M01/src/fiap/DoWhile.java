package fiap;

import java.util.Scanner;

public class DoWhile {
    public static void ensinandowhile(){
        /*
        Esse loop primeiramente ira executar o bloco de código
        para depois testar a condição.
            do {
                <Instruções>
            }while ( <condição> );
        */

        int num = 0;
        do {
            num = num + 1;
            System.out.println(num);
        }while (num < 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        do{
            System.out.println("Digite um numero: ");
            int n1 = sc.nextInt();
            System.out.println("Digite outro numero: ");
            int n2 = sc.nextInt();
            int soma = n1 + n2;
            System.out.println("A soma é:  = " + soma);
            System.out.println("Deseja somar outro número? (S/N)");
            op = sc.next().toUpperCase();
        }while (op.equals("S"));
        System.out.println("Calculadora finalizada, obg");
        sc.close();

        /*
         * Outro ponto importante do exemplo é que não podemos
         * definir inicialmente quantas vezes o loop será executado,
         * pois isso dependerá dos valores inseridos pelo usuáro
         *
         *
         *O FOR é indicado pra estrutura controlada
         * quando sabemos exatamente vamos repetir.
         */
    }


}
