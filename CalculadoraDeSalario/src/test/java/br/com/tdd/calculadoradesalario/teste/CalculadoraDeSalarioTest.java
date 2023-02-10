
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
        //Cenário
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();        
        //Funcionario desenvolvedor = new Funcionario("Ricardo", 4000.0, Cargo.Desenvolvedor);
        Funcionario dba = new Funcionario("Maria", 500.0, Cargo.DBA);
        
        //Ação
        //double salario = calculadora.calculaSalario(desenvolvedor);
        double salario = calculadora.calculaSalario(dba);
        
        
        //Validação
        //assertEquals(4000.0 * 0.8, salario, 0.00001);
        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
}
