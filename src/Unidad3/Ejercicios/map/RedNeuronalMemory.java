package Unidad3.Ejercicios.map;

import java.util.HashMap;
import java.util.Map;

public class RedNeuronalMemory {
    public static void main(String[] args) {

        Map<String, Double> mapa = new HashMap<>();

        mapa.put("w1", 0.57);
        mapa.put("w2", 0.17);
        mapa.put("w4", 0.47);
        mapa.put("w5", 0.27);

        double sumaPesos = 0.0;

        if(mapa.containsKey("w1")){
            mapa.replace("w1", 0.87);
        }

        for(Double d : mapa.values()) {
            sumaPesos += d;
        }

        System.out.println("La suma total de los pesos del mapa es " + sumaPesos);

        mapa.remove("w2");

        System.out.println("Mapa después de remover w2: " + mapa);
    }
}