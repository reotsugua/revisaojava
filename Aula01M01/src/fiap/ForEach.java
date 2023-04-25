package fiap;

public class ForEach {
    public static void main(String[] args) {
        Carro[] carros = new Carro[1];

        Carro carro  =new Carro();
        carro.setModelo("Gol");

        carros[0] = carro;
        
        String modelo = carros[0].getModelo();
        System.out.println("modelo = " + modelo);
        /*ForEach
        O primeiro parâmetro é o tipo do array. O segundo é um nome para
        a variável que vai receber cada um dos itens do vetor. O último
        parâmetro, que está após os dois pontos é o array que queremos percorrer.
        for( <Tipo> <variável> : <Array>) {
        }
        */
        for (Carro car: carros) {
            System.out.println("car = " + car.getModelo());
        }
    }
}
