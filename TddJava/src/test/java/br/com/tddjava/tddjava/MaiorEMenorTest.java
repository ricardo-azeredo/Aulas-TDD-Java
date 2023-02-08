/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.tddjava.tddjava;

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
public class MaiorEMenorTest {
    private CarrinhoDeCompras carrinho;
    private MaiorEMenor algoritmo;
    private Produto produto;
        
    public MaiorEMenorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        carrinho = new CarrinhoDeCompras();
        algoritmo = new MaiorEMenor();
        
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of encontra method, of class MaiorEMenor.
     */
    @Test
    public void testEncontra() {
        System.out.println("encontra");        
        algoritmo.encontra(carrinho);
        assertEquals("Geladeira", carrinho.produtos.get(0).getNome());
        assertEquals(450.0,carrinho.produtos.get(0).getValor());
    }

    /**
     * Test of getMenor method, of class MaiorEMenor.
     */
    @Test
    public void testGetMenor() {
        System.out.println("getMenor"); 
        algoritmo.encontra(carrinho);
        assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());       
    }

    /**
     * Test of getMaior method, of class MaiorEMenor.
     */
    @Test
    public void testGetMaior() {
        System.out.println("getMaior");     
        algoritmo.encontra(carrinho);
        assertEquals("Geladeira", algoritmo.getMaior().getNome());       
    }
    
}
