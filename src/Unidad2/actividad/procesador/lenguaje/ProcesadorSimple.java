package Unidad2.actividad.procesador.lenguaje;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcesadorSimple extends ProcesadorNLP {

    private List<String> tokens = new ArrayList<>();

    @Override
    public List<String> tokenizar() {
        tokens = Arrays.asList(textoCrudo.split("\\s+"));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        textoCrudo = textoCrudo.toLowerCase()
                .replace(".", "")
                .replace(",", "");
    }

    @Override
    public Object transformarParaModelo() {
        return tokens.size(); // conteo de palabras
    }
}
