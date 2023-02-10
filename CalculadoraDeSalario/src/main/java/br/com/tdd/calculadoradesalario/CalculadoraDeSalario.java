/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.tdd.calculadoradesalario;

/**
 *
 * @author admin
 */
public class CalculadoraDeSalario {

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
    
    public double calculaSalario(Funcionario funcionario) {
        if(funcionario.getSalario() > 3000){
            return funcionario.getSalario() * 0.8;
        }
        return funcionario.getSalario() * 0.9;
//        if(funcionario.getCargo().equals(Cargo.Desenvolvedor)){
//            if(funcionario.getSalario()>3000) return 3200.0;
//            return 1350.0;
//        }
//        return 425.0;
    }
}
