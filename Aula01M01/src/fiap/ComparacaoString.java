package fiap;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome = new String("FIAP");
        String nome2 = new String("FIAP");
        if (nome == nome2){
            System.out.println("As Strings são iguais");
        }else {
            System.out.println("As Strings são diferentes");
        }
        System.out.println("--------------------------");
        String nome3 = "FIAP";
        String nome4 = "FIAP";
        if (nome3 == nome4){
            System.out.println("As Strings são iguais");
        }else{
            System.out.println("As Strings são diferentes");
        }
        System.out.println("--------------------------");
        String nome5 = "FIAP";
        String nome6 = new String("FIAP");
        if (nome5.equals(nome6)){
            System.out.println("As Strings são iguais");
        }else{
            System.out.println("As Strings são diferentes");
        }
        if (!nome5.equals(nome6)){
            System.out.println("As Strings são diferentes");
        }else {
            System.out.println("As Strings são iguais");
        }
        System.out.println("-----------------------------");
        String nome7 = "fiap";
        String nome8 = new String("FIAP");
        if (nome7.equalsIgnoreCase(nome8)){
            System.out.println("As Strings são iguais");
        }else{
            System.out.println("As Strings são diferentes ");
        }
        System.out.println("-----------------------------");
        String facu = "FIAP - A Melhor Faculdade de Tecnologia";
        if (facu.startsWith("FIAP")){
            System.out.println("A string começa com FIAP");
        }else{
            System.out.println("A string não começa com FIAP");
        }
    }
}
