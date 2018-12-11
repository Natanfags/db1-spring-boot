package br.com.db1.cidade.cidadeapi;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false, length = 60)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "uf", nullable = false, length =2)
	private Uf uf;
	
	protected Cidade() {
	}
	
	public Cidade(String nome, Uf uf) {
		this.nome = nome;
		this.uf = uf;
	}
}