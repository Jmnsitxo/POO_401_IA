package Unidad2.actividad.procesador.lenguaje;

import java.util.*;

public class ProcesadorAnalisisSentimiento extends ProcesadorNLP {

    private List<String> tokens = new ArrayList<>();

    private final Set<String> stopWords = new HashSet<>(Arrays.asList(
            "el", "la", "los", "las", "un", "una", "y", "de"
    ));

    private final Set<String> palabrasPositivas = new HashSet<>(Arrays.asList(
            "bueno", "excelente", "feliz", "genial", "increible"
    ));

    @Override
    public List<String> tokenizar() {
        tokens = new ArrayList<>(Arrays.asList(textoCrudo.toLowerCase().split("\\s+")));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        tokens.removeIf(palabra -> stopWords.contains(palabra));
    }

    @Override
    public Object transformarParaModelo() {
        Map<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : tokens) {
            if (palabrasPositivas.contains(palabra)) {
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
        }

        return frecuencia;
    }
}
