package fiap.Collections;

import java.util.ArrayList;

public class Genericss {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Aluno aluno = new Aluno();

        lista.add("FIAP"); //String
        lista.add(2); //Integer
        lista.add(aluno); //Aluno

        lista.forEach(System.out::println);
        System.out.println("---------------------");

        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Thiago");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("João");

        listaAluno.add(aluno1);
        listaAluno.add(aluno2);

        for (int i = 0; i < listaAluno.size(); i++) {
            Aluno alu = listaAluno.get(i);
            System.out.println(alu.getNome());
        }
        System.out.println(aluno.getNome());
        listaAluno.forEach(System.out::println);
        System.out.println("---------------------");
        for (Aluno al:listaAluno) {
            System.out.println(al.getNome());
        }

    }

}
