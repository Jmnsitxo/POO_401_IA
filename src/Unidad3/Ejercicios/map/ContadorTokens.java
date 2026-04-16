package Unidad3.Ejercicios.map;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokens {

    public static void main(String[] args) {

        String[] tokens = {"ia", "python", "redes", "neuronas", "ia", "neuronas"};

        Map<String, Integer> frecuencia = new HashMap<>();

        for (String d : tokens) {
            frecuencia.put(d, frecuencia.getOrDefault(d, 0) + 1);
        }

        System.out.println("Frecuencia sin usar merge:");

        for (String clave : frecuencia.keySet()) {
            System.out.println(clave + " = " + frecuencia.get(clave));
        }
    }
}

