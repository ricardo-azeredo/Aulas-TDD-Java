/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tddjava.tddjava;

/**
 *
 * @author admin
 */
public class MaiorEMenor {
    private Produto menor;
    private Produto maior;        
    
    public void encontra(CarrinhoDeCompras carrinho) {
        for(Produto produto : carrinho.getProdutos()) {
            if(menor == null || produto.getValor() < menor.getValor()) {
                menor = produto;
            }
            if (maior == null || produto.getValor() > maior.getValor()){
                maior = produto;
            }
        }
    }
    
    public Produto getMenor() {
        return menor;
    }
    public Produto getMaior() {
        return maior;
    }
}
