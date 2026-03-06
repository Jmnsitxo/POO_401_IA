package Unidad1.FiltroImagen;

public class Main {
    public static void main(String[] args) {
        DetectorDeBordes f1 = new DetectorDeBordes();
        ReductorDeRuido f2 = new ReductorDeRuido();

        f1.aplicar();
        f2.aplicar();
    }
}
