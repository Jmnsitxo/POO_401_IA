package Unidad3.Ejercicios.set;

import java.util.HashSet;
import java.util.Set;

public class GeneradorVocabulario {

    public static void main(String[] args) {
        String texto = "el modelo de la ia es un modelo bueno porque el modelo aprende";

        String[] tokens = texto.split(" ");

        Set<String> vocabulario = new HashSet<>();

        for (String t : tokens) {
            vocabulario.add(t);
        }

        // Resultados
        System.out.println("Vocabulario: " + vocabulario);
        System.out.println("Palabras procesadas: " + tokens.length);
        System.out.println("Número de palabras únicas: " + vocabulario.size());
        System.out.println("Vocabulario final: " + vocabulario);

        if (vocabulario.contains("ia")) {
            System.out.println("El vocabulario contiene la palabra 'ia'");
        }
    }
}