package aula05;

import java.util.ArrayList;
import java.util.List;

public class Listt {
    public static void main(String[] args){
        String[] lista = new String[1];
        lista[0] = "posição 1";

        String[] lista2 = new String[2];
        lista2[0] = lista[0];
        lista2[1] = "posição 2";


        List<String> listaProdutos = new ArrayList<>();
        listaProdutos.add("Creme Dental");
        listaProdutos.add("Bolsa");
        listaProdutos.add("Fio Dental");
        listaProdutos.add("Creme");
        listaProdutos.add("Perfume");

        /*for (String item: listaProdutos
             ) {
            System.out.println(item);
        }*/

        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println( (i+1) +" - "+ listaProdutos.get(i));
        }

    }
}
