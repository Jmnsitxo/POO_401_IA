package Unidad2.Paradigma00;


public class Restaurante {
    String nombre;
    String tipoDeComida;
    int calificacion;

    public void abrir() {
        System.out.println("El restaurante " + nombre + " especializado en comida "
                + tipoDeComida + " (Calificación: " + calificacion + "/5) ya está ABIERTO.");
    }

    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante();
        rest1.nombre = "La Taquería";
        rest1.tipoDeComida = "Mexicana";
        rest1.calificacion = 5;

        Restaurante rest2 = new Restaurante();
        rest2.nombre = "Sushi Master";
        rest2.tipoDeComida = "Japonesa";
        rest2.calificacion = 4;

        rest1.abrir();
        rest2.abrir();
    }
}