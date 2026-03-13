package Unidad1.orquestador;

public class Main {
    public static void main(String[] args) {

        EvaluadorMetricas m1 = new ErrorCuadraticoMedio();
        EvaluadorMetricas m2 = new ErrorAbsolutoMedio();

        m1.calcularError();
        m2.calcularError();
    }
}
