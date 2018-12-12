package br.com.db1.db1start.calculadora;

public class Calculadora {
	
	private Double primeiroNumero;
	private Double segundoNumero;
	
	public Calculadora(Double primeiroNumero, Double segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}
	
	public Double executaOperacao(Operacoes operacoes) {
		return operacoes.executaOperacao(this.primeiroNumero, this.segundoNumero);
	}

	
}
