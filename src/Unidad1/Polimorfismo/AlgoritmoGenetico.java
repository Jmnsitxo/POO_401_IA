package Unidad1.Polimorfismo;

class AlgoritmoGenetico extends OptimizadorIA {

    public AlgoritmoGenetico() {
        super("Algoritmo Genético");
    }

    @Override
    public void ajustarParametros() {
        System.out.println(nombreAlgoritmo + ": Aplicando cruce, mutación y selección natural de individuos...");
    }
}
