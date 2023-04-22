package aula01;

import java.math.BigInteger;

public class Ex01 {
    public static void main(String[] args) {
        BigInteger janeiro = new BigInteger("10000");
        BigInteger fevereiro = new BigInteger("17000");
        BigInteger marco = new BigInteger("23000");

        BigInteger total = new BigInteger("0");
        total = total.add(janeiro).add(fevereiro).add(marco);

        System.out.printf("Janeiro = R$ %d\n", janeiro);
        System.out.printf("Fevereiro = R$ %d\n",fevereiro);
        System.out.printf("Março = R$ %d\n",marco);
        System.out.println("---------------------");
        System.out.printf("TOTAL = R$ %d",total);
    }
    

}
