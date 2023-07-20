package aula05;

public class Main {
    public static void main(String[] args) {
        System.out.println(somaValores(3.0, 5d));


    }

    public static String somaValores(Double n1, Double n2){
        Double soma = n1 + n2;
        return soma.toString();
    }
}
