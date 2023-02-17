package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExamenTest {

    @Test
    public void test1() {
        char tipo = 'N';
        double sueldo = 1000.0;
        int antiguedad = 12;
        double expected = 1000.0;

        double result = Examen.ej9(tipo, sueldo, antiguedad);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void test2() {
        char tipo = 'E';
        double sueldo = 1001.0;
        int antiguedad = 12;
        double expected = 1001.0;

        double result = Examen.ej9(tipo, sueldo, antiguedad);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void test3() {
        char tipo = 'X';
        double sueldo = 1000.0;
        int antiguedad = 12;
        double expected = 1000.0;

        double result = Examen.ej9(tipo, sueldo, antiguedad);
        assertEquals(expected, result, 0.001);
    }
    @Test
    public void test4() {
        char tipo = 'N';
        double sueldo = 1000.0;
        int antiguedad = 0;
        double expected = 1000.0;
        double result = Examen.ej9(tipo, sueldo, antiguedad);
        assertEquals(expected, result, 0.001);
    }
    @Test
    public void test5() {
        char tipo = 'N';
        double sueldo = 999.0;
        int antiguedad = 12;
        double expected = 999.0;

        double result = Examen.ej9(tipo, sueldo, antiguedad);
        assertEquals(expected, result, 0.001);
    }
}