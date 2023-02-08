
package br.com.tddjava.tddjava;

import java.util.ArrayList;
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
public class CarrinhoDeComprasTest {
    Produto produto; 
    CarrinhoDeCompras carrinho;
    ArrayList<Produto> lista;
    public CarrinhoDeComprasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        produto = new Produto("Celular",1200);
        carrinho = new CarrinhoDeCompras();
        lista = new ArrayList<>();
        lista.add(produto);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adiciona method, of class CarrinhoDeCompras.
     */
    @Test
    public void testAdiciona() {
        System.out.println("adiciona");
        carrinho.adiciona(produto);
        assertEquals("Celular", produto.getNome());
        assertEquals(1200, produto.getValor());
    }

    /**
     * Test of getProdutos method, of class CarrinhoDeCompras.
     */
    @Test
    public void testGetProdutos() {
        System.out.println("getProdutos");        
        assertEquals("Celular", lista.get(0).getNome());
        assertEquals(1200, lista.get(0).getValor());
        
    }
    
}
