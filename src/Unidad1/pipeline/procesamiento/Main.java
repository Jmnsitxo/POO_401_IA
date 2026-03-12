package Unidad1.pipeline.procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiltroImagen> pipeline = new ArrayList<>();

        pipeline.add(new ReductorDeRuido());
        pipeline.add(new DetectorDeBordes());
        pipeline.add(new EscalaDeGrises());

        for (FiltroImagen f : pipeline) {
            f.procesar();
        }
    }

}
