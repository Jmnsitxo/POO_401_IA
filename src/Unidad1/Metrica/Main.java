package Unidad1.Metrica;

public class Main {
    public static void main(String[] args) {
        Precision p = new Precision();
        ErrorCuadraticoMedio mse = new ErrorCuadraticoMedio();

        System.out.println(p.calcularResultado());
        System.out.println(mse.calcularResultado());
    }
}
