/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package matematica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class NumerosTest {
    public Numeros num;
    
    public NumerosTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        num = new Numeros();
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    /**
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

    
     * Test of numerosPar method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testNumerosPar() {
        assertEquals(true, this.num.numerosPar(8));
    }

    /**
     * Test of areaQuadrado method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testAreaQuadrado() {
       assertEquals(100, this.num.areaQuadrado(10));
    }

    /**
     * Test of numeroDivisivel method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testNumeroDivisivel() {
        assertTrue(this.num.numeroDivisivel(4, 2));
    }
    
}
