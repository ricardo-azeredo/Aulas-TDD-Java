/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.tdd.calculadoradesalario.teste;

import br.com.tdd.calculadoradesalario.CalculadoraDeSalario;
import br.com.tdd.calculadoradesalario.Cargo;
import br.com.tdd.calculadoradesalario.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class CalculadoraDeSalarioTest {
    @Test
    public void calculadorSalarioDesenvolvedorComSalarioAbaixoDoLimite(){
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();        
        Funcionario desenvolvedor = new Funcionario("Ricardo", 4000.0, Cargo.Desenvolvedor);
        
        double salario = calculadora.calculaSalario(desenvolvedor);
        
        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }
}
