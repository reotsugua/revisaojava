package aula04;

import fiap.Arrays;

public class Recursao {
    public static void main (String[] args){
        Integer[] array = {5,2,6,4,7,8};
        array[0] = 0;
        repetir(array,10);
    }

    public static void repetir(Integer[] repetNum, int fimNum){
        if (repetNum[0] <= fimNum) {
            System.out.println(repetNum[0]);
            repetir(repetNum, fimNum);
        }
    }
}
