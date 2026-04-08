package Practica02.Impl;

import Practica02.Tokenizador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Implementa la interfaz
public class TokenizadorImpl implements Tokenizador {

    @Override
    public List<String> tokenizar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return new ArrayList<>();
        }

        return new ArrayList<>(Arrays.asList(texto.split(" ")));
    }
}