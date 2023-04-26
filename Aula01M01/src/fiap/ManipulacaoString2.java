package fiap;

public class ManipulacaoString2 {
    public static void main(String[] args) {
        String facu = "FIAP - A Melhor Faculdade de Tecnologia";
        System.out.println(facu.toUpperCase());
        System.out.println("A nova string é: " + facu);
        //String facu = "FIAP - A Melhor Faculdade de Tecnologia";
        String nova = facu.replace('a', 'x');
        System.out.println("A nova string é: " + nova);
        //String facu = "FIAP - A Melhor Faculdade de Tecnologia";
        String novas = facu.replace("Tecnologia", "São Paulo");
        System.out.println("A nova string é: " + novas);
        System.out.println("Valor da variável facu: " + facu);
        System.out.println("----------------------------");
        String facul = "FIAP - A Melhor Faculdade de Tecnologia";
        String[] palavras = facu.split(" ");
        for (String p : palavras) {
            System.out.println(p);
        }
    }
}
