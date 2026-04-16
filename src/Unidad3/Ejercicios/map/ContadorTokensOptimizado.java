package Unidad3.Ejercicios.map;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokensOptimizado {

    public static void main(String[] args) {

        String[] tokens = {"ia", "neuronas", "ia", "python", "python", "modelo"};

        Map<String, Integer> frecuencia = new HashMap<>();

        for (String t : tokens) {
            frecuencia.merge(t, 1, (valorAnterior, valorNuevo) -> valorAnterior + valorNuevo);
        }

        System.out.print("Frecuencia con el metodo Merge de Map");
        frecuencia.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}