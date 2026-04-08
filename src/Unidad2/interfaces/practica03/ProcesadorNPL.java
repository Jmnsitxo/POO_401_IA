package Unidad2.interfaces.practica03;

import java.util.List;

public abstract class ProcesadorNPL {

    protected String textoCrudo;

    public ProcesadorNPL(String textoCrudo) {
        this.textoCrudo = textoCrudo;
    }

    public abstract List<String> tokenizar();

    public abstract void limpiarTexto();

    public abstract Object transformarParaModelo();
}
