package Unidad1.orquestador;

class EvaluadorMetricas {
    void calcularError() {
        System.out.println("Calculando error generico");
    }
}

class ErrorCuadraticoMedio extends EvaluadorMetricas {
    void calcularError() {
        System.out.println("Calculando Error Cuadratico Medio");
    }
}

class ErrorAbsolutoMedio extends EvaluadorMetricas {
    void calcularError() {
        System.out.println("Calculando Error Absoluto Medio");
    }
}

