package aula01;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Long numero6 = 5L;
        numero6 = numero6+6;

        System.out.println("numero6 = " + numero6);

        BigInteger numeroBig = new BigInteger("1000000");
        //numeroBig = numeroBig.add(new BigInteger(numero6.toString()));
        BigInteger numBig = new BigInteger("11");
        numeroBig = numeroBig.add(numBig);

        System.out.println("numeroBig = " + numeroBig);
        
        /*Integer n =3;

        List<Integer> lista = List.of(0,1,2,3,4,5,6,7,8,9,10);

        lista.forEach((i)->System.out.println(n+" x "+i+" = "+n*i));*/

        
        /*for (int i = 0; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }*/
    }
}
