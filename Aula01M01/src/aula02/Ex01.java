package aula02;

import java.math.BigInteger;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args){

        String frase = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";

        BigInteger janeiro = new BigInteger(frase.substring(9, 13));
        BigInteger fevereiro = new BigInteger(frase.substring(26, 30));
        BigInteger marco = new BigInteger(frase.substring(39, 43));
        BigInteger total = janeiro.add(fevereiro).add(marco);


        frase = frase.replace(":", ": R$");
        String[] fraseSeparada = frase.split(",");

        System.out.println(fraseSeparada[0].trim());
        System.out.println(fraseSeparada[1].trim());
        System.out.println(fraseSeparada[2].trim());
        System.out.println("Total: R$ "+total);
    }



}
