
package br.com.tddjava.tddjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class TestaMaiorEMenor {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    MaiorEMenor algoritmo = new MaiorEMenor();
    Produto geladeira = new Produto("Geladeira", 450.0);
    Produto liquidificador = new Produto("Liquidificador", 250.0);
    Produto jogoDePrato = new Produto("Jogo de pratos", 77.0);
    
    @Test
    public void ordemDescrescente(){        
        carrinho.adiciona(geladeira);
        carrinho.adiciona(liquidificador);        
        carrinho.adiciona(jogoDePrato);
                
        algoritmo.encontra(carrinho);
        
        assertEquals(jogoDePrato,algoritmo.getMenor());        
        assertEquals(geladeira,algoritmo.getMaior());        
    }
    
    @Test
    public void ordemCrescente(){
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));        
                
        algoritmo.encontra(carrinho);
        
        assertEquals("Jogo de pratos",algoritmo.getMenor().getNome());        
        assertEquals("Geladeira",algoritmo.getMaior().getNome());     
    }
    @Test
    public void unicoProdutoCarrinho(){
       
        carrinho.adiciona(geladeira);        
                
        algoritmo.encontra(carrinho);
        
        assertEquals(geladeira,algoritmo.getMenor());     
        assertEquals(geladeira,algoritmo.getMaior());     
    }
}
