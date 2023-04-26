package fiap;

public class ManipulacaoString {
    public static void main(String[] args) {
        /* Uma string deve ser declarada, instanciada e inicializada.
        String nome;
        String nome = new String();
        String nome = new String();
        nome = "FIAP";
        String nome = new String("FIAP");
        String nome = "FIAP";
        */

        String slo = "FIAP \nA melhor faculdade de tecnologia";
        System.out.println(slo);
        System.out.println("Faculdade: \"FIAP\"");
        System.out.println("--------------------------");
        /*String nome = "FIAP";
        String slogan = "A melhor faculdade de tecnologia";

        String faculdade = nome;
        faculdade += " - ";
        System.out.println("faculdade = " + faculdade);
        faculdade += slogan;
        System.out.println("faculdade = " + faculdade);

        System.out.println(faculdade);*/

        String nome = "FIAP";
        String slogan = "A melhor faculdade de tecnologia";
        String faculdade = nome.concat(" - ").concat(slogan);
        System.out.println(faculdade);

    }
}
