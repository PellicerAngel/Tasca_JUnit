/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 *
 * @author usuari
 */
public class Calculadora_Junit {

    @Test
    public void test_suma() {
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.suma(3, 4);
        float esperado = 8;
        assertEquals(esperado, resultado);
    }

    @Test
    public test_resta() {
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.resta(6, 4);
        float esperado = 2;
        assertEquals(esperado, resultado);
    }

    @Test
    public test_multiplica() {
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.multiplica(2, 3);
        float esperado = 6;
        assertEquals(esperado, resultado);
    }

    @Test
    public test_divideix() {
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.divideix(6, 3);
        float esperado = 2;
        assertEquals(esperado, resultado);
    }

    @Test
    public test_majorQue() {
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.majorQue(6, 3);
        float esperado = 6;
        assertEquals(esperado, resultado);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
