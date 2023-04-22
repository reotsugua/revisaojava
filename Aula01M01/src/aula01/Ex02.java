package aula01;

public class Ex02 {
    public static void main(String[] args) {
        final Double add = 0.023D;
        Integer idade = 31;
        
        Double sorte = add + idade.doubleValue();

        System.out.println("O número da sorte é: " + sorte);
        System.out.printf("O número da sorte é: %d.023",idade);
    }
}
