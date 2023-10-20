package com.runtimeException;

public class AritmeticaUno {
    public static int divicion(int numerador, int denominador) {
        if( denominador == 0) {
            throw new RuntimeExceptionCl("numero cero no aceptado en runtime");
        }

        return numerador / denominador;
    }
}
