package fiap.Collections;

import java.util.ArrayList;
import java.util.List;

public class AarrayListt {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("LTP");
        lista.add("web");
        lista.add("Algoritimos");
        lista.add("Renan");
        lista.add(0,"teste");
        lista.set(2,"Augusto");
        lista.remove(1);

        System.out.println(lista.indexOf("Renan"));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("--------------------");
        lista.forEach(System.out::println);
        System.out.println("--------------------");
        System.out.println(lista.get(2));


    }
}
