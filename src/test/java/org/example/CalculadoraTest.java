package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculadoraTest {

    final Calculadora resultado = new Calculadora();
    final Calculadora auxiliar = new Calculadora();

    @Test
    void sumar() {
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
        assertEquals(240,resultado.multiplicar(80,3));
        assertEquals(240,resultado.multiplicar(3,80));

        assertNotEquals(605,auxiliar.multiplicar(15,(auxiliar.restar(90,50))));

        assertNotEquals(2700,auxiliar.multiplicar(25,auxiliar.sumar(70,40)));
    }

    @Test
    void division() {

        assertEquals(110,auxiliar.division((auxiliar.sumar(150,180)),3));
    }
}