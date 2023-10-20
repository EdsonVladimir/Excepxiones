package com.excepciones;

public class Aritmetica {
    public static int divicion(int numerador, int denominador) throws OperationException {
        if(denominador == 0) {
            throw new OperationException("error en las diviviones entre cero");
        }
        return numerador / denominador;
    }
}
