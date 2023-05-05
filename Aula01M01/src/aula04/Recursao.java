package aula04;

import fiap.Arrays;

public class Recursao {
    public static void main (String[] args){
        Integer[] array = {0,1,2,3,4,5};
        //array[0] = 0;
        repetir(array,2);
        System.out.println("--------------");
        repetirInverso(array, 3);
    }

    public static void repetir(Integer[] lista, int repetNum){
        if (lista.length > repetNum) {
            System.out.println(lista[repetNum]);
            repetir(lista, ++repetNum);
        }
    }public static void repetirInverso(Integer[] lista, int repetNum){
        if (0 <= repetNum) {
            System.out.println(lista[repetNum]);
            //repetNum--;
            repetirInverso(lista, --repetNum);
        }
    }
}
