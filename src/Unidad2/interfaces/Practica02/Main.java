package Unidad2.interfaces.Practica02;

import Practica02.Impl.TokenizadorImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String texto = "Hola mundo esto es una prueba";

        // Usamos la interfaz (buena práctica)
        Tokenizador tokenizador = new TokenizadorImpl();

        List<String> tokens = tokenizador.tokenizar(texto);

        System.out.println("Tokens:");
        for (String t : tokens) {
            System.out.println(t);
        }
    }
}

