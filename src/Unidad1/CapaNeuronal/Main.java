package Unidad1.CapaNeuronal;

public class Main {
    public static void main(String[] args) {
        CapaConvolucional c1 = new CapaConvolucional();
        CapaDensa c2 = new CapaDensa();

        c1.propagacionHaciaAdelante();
        c2.propagacionHaciaAdelante();
    }
}
