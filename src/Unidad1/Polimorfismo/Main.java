package Unidad1.Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<OptimizadorIA> optimizadores = new ArrayList<>();

        optimizadores.add(new DescensoGradiente());
        optimizadores.add(new AlgoritmoGenetico());

        for (OptimizadorIA opt : optimizadores) {
            opt.ajustarParametros();
        }
    }
}
