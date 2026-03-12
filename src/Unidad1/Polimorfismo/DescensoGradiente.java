package Unidad1.Polimorfismo;

    class DescensoGradiente extends OptimizadorIA {

        public DescensoGradiente() {
            super("Descenso por Gradiente");
        }

        @Override
        public void ajustarParametros() {
            System.out.println(nombreAlgoritmo + ": Calculando derivadas parciales y actualizando pesos...");
        }
    }