package aula01;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer n =3;

        List<Integer> lista = List.of(0,1,2,3,4,5,6,7,8,9,10);

        lista.forEach((i)->System.out.println(n+" x "+i+" = "+n*i));

        
        /*for (int i = 0; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }*/
    }
}
