package fiap.Collections;

import java.util.HashMap;

public class HashhMapp {
    public static void main(String[] args) {
        HashMap mapa = new HashMap();

        mapa.put("RM1234", "Thiago");
        mapa.put("RM4321", "João");
        mapa.put("RM4321", "Renan");
        mapa.put("RM4329", "João");
        mapa.put("RM4338", "Thiago");

        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        System.out.println(mapa.get("RM1234"));
        //smepre recebe a chave
    }
}
