package br.com.db1.db1start.calculadora.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.calculadora.Calculadora;
import br.com.db1.db1start.calculadora.Operacoes;

public class CalculadoraTest {
	
	@Test
	public void deveRetornarSoma() {
		Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoSoma = calculadora.executaOperacao(Operacoes.SOMA);
		
		Assert.assertEquals(6.0, operacaoSoma, 0.0);
	}
	
	@Test
	public void deveRetornarSubtracao() {
		Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoSubtrai = calculadora.executaOperacao(Operacoes.SUBTRACAO);
		
		Assert.assertEquals(2.0, operacaoSubtrai, 0.0);
	}
	
	@Test
	public void deveRetornarMultiplicacao() {
		Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoMultiplica= calculadora.executaOperacao(Operacoes.MULTIPLICACAO);
		
		Assert.assertEquals(8.0, operacaoMultiplica, 0.0);
	}
	
	@Test
	public void deveRetornarDivisao() {
Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoDivisao = calculadora.executaOperacao(Operacoes.DIVISAO);
		
		Assert.assertEquals(2.0, operacaoDivisao, 0.0);
	}

}
