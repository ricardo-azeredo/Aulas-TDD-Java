
package br.com.tddjava.tddjava;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    ArrayList<Produto> produtos = new ArrayList<>();;
   
    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }
    
    public ArrayList<Produto> getProdutos(){
        return produtos;
    } 
}
