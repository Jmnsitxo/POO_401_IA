package Unidad3.Ejercicios.generica;
import java.util.List;

public class Modelo<T> {
    public void activar(List<T> activaciones) {
        System.out.println("Activando modelo con datos:");

        for (T dato : activaciones) {
            System.out.println(dato);
        }
    }
}