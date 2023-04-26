package fiap.Collections;

import java.util.HashSet;

public class HashhSett {
    public static void main(String[] args) {
        HashSet cursos = new HashSet<>();

        cursos.add("Java");
        cursos.add(".NET");
        cursos.add("Android");

        cursos.add("Java"); //Repetido!

        //Imprime todos os elementos
        System.out.println(cursos);
    }
}
