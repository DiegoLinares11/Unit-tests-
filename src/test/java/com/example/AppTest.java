package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {

    @Test
    public void testSumar() {
        // Crear una instancia de la clase App
        App app = new App();

        // Prueba unitaria: verificar si la suma es correcta
        int result = app.sumar(2, 3);

        // Verificar que el resultado de sumar(2, 3) sea 5
        assertEquals("La suma de 2 + 3 debe ser 5", 5, result);  // El primer parámetro es el esperado
    }
}

