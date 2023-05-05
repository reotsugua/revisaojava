package aula04;

import fiap.Arrays;

public class Recursao {
    public static void main (String[] args){
        Integer[] array = {5,2,6,4,7,8};
        //array[0] = 0;
        repetir(array,2);
    }

    public static void repetir(Integer[] lista, int repetNum){
        if (lista.length > repetNum) {
            System.out.println(lista[repetNum]);
            repetir(lista, ++repetNum);
        }
    }
}
