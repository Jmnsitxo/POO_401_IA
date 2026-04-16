package Unidad3.Ejercicios.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class SensorTracker {
    public static void main(String[] args) {

        Set<String> camarasActivas = new HashSet<>();

        camarasActivas.add("CAM-01");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-03");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-05");
        camarasActivas.add("CAM-01");

        System.out.println("Cámaras activas iniciales: " + camarasActivas);

        camarasActivas.remove("CAM-03");
        System.out.println("Después de desactivar CAM-03: " + camarasActivas);

        // Operaciones de conjuntos
        Set<String> camarasEnMantenimiento = new HashSet<>();
        camarasEnMantenimiento.add("CAM-01");
        camarasEnMantenimiento.add("CAM-05");

        // Remover las que están en mantenimiento
        camarasActivas.removeAll(camarasEnMantenimiento);
        System.out.println("Cámaras activas después de remover las de mantenimiento: " + camarasActivas);

        // Mostrar ordenado (extra usando Collections)
        System.out.println("Cámaras activas ordenadas:");
        camarasActivas.stream().sorted().forEach(System.out::println);


        camarasActivas.clear();
        System.out.println("Después de limpiar: " + camarasActivas);
    }
}