package br.com.db1.db1start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.Cliente;
import br.com.db1.db1start.TratamentoNome;

public class ClienteTest {

	@Test
	public void deveRetornarNomeMaiusculo() {
		Cliente cliente = new Cliente("Maiko Cunha") ;
		
		String nomeMaiusculo = cliente.trataNome(TratamentoNome.UPPERCASE);
		
		Assert.assertEquals("MAIKO CUNHA", nomeMaiusculo);
	}
	
	@Test
	public void deveRetornarNomeMinusculo() {
		Cliente cliente = new Cliente ("MAIKO CUNHA");
		
		String nomeMinusculo = cliente.trataNome(TratamentoNome.LOWERCASE);
		
		Assert.assertEquals("maiko cunha", nomeMinusculo);
	}
}
