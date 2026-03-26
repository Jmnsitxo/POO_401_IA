package Unidad2.interfaces;

public class Main {

    public static void main(String[] args) {

        MiSerializable obj1 = new Archivo("datos.txt");
        MiSerializable obj2 = new Usuario("Bruno");

        obj1.a();
        obj2.a();
    }
}
