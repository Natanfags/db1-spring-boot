package br.com.db1.db1start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.Regioes;
import br.com.db1.db1start.Uf;

public class RegioesTest {
	
	@Test
	public void deveRetornarEstadosDoSul() {
		Uf[] ufs = Regioes.SUL.getUfs();
		Assert.assertArrayEquals(new Uf[] {Uf.PR, Uf.SC}, ufs);
	}
}

