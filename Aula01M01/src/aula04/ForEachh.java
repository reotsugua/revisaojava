package aula04;

import java.util.ArrayList;
import java.util.List;

public class ForEachh {
    public static void main (String[] args){
        Integer[] array = {0,1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } //serve pra manipular a lista e mudar algum dado
        System.out.println("----------------");

        for (int num : array
             ) {
            System.out.println(array[num]);
        }// serve só pra lista, não da pra mudar nada
        System.out.println("----------------");

        List<String> lista = List.of("renna", "pedro", "matheus");
        lista.forEach(item -> {
            String primeiraLetra = item.substring(0,1).toUpperCase();
            String retoNome = item.substring(1).toLowerCase();
            String nomeCompleto = primeiraLetra+retoNome;
            System.out.println(nomeCompleto);
        });
    }
}
