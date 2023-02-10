/*
 *  Regra de Negócio
 *  Desenvolvedores: desconto de 20% salário maior q R$ 3000. Caso contrário, 10%.
 *  DBA e Testador: desconto de 25% salario maior q R$ 2500. Caso contrário, 15%.  
 */
package br.com.tdd.calculadoradesalario;


public class Funcionario {
    private String nome;
    private double salario;
    private Cargo cargo;
    
    public Funcionario(String nome, double salario, Cargo cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public Cargo getCargo(){
        return cargo;
    }
}
