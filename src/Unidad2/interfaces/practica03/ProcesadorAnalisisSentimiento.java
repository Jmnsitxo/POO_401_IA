package Unidad2.interfaces.practica03;

import java.util.*;

public class ProcesadorAnalisisSentimiento extends ProcesadorNPL {

    private List<String> tokens;
    private Set<String> stopWords;
    private Set<String> palabrasPositivas;

    // Constructor
    public ProcesadorAnalisisSentimiento(String textoCrudo) {
        super(textoCrudo);

        tokens = new ArrayList<>();

        stopWords = new HashSet<>(Arrays.asList(
                "el", "la", "y", "de", "que", "en"
        ));

        palabrasPositivas = new HashSet<>(Arrays.asList(
                "bueno", "excelente", "feliz", "genial", "increible"
        ));
    }

    @Override
    public List<String> tokenizar() {
        tokens = new ArrayList<>(Arrays.asList(textoCrudo.split(" ")));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        textoCrudo = textoCrudo.toLowerCase().replaceAll("[^a-zA-Záéíóúñ ]", "");
    }

    @Override
    public Object transformarParaModelo() {
        int positivos = 0;

        for (String palabra : tokens) {
            if (palabrasPositivas.contains(palabra)) {
                positivos++;
            }
        }

        return "Palabras positivas encontradas: " + positivos;
    }
}