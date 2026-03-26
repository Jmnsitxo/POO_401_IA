package Unidad2.actividad.procesador.lenguaje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String texto = "El sistema es excelente y muy bueno";

        List<ProcesadorNLP> procesadores = new ArrayList<>();

        procesadores.add(new ProcesadorSimple());
        procesadores.add(new ProcesadorAnalisisSentimiento());

        for (ProcesadorNLP procesador : procesadores) {

            System.out.println("=== " + procesador.getClass().getSimpleName() + " ===");

            procesador.cargarTexto(texto);

            procesador.limpiarTexto();

            System.out.println("Tokens: " + procesador.tokenizar());

            Object resultado = procesador.transformarParaModelo();

            System.out.println("Resultado: " + resultado);
            System.out.println();
        }
    }
}