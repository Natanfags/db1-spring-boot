package br.com.db1.db1start;

public enum Regioes {
	
	NORTE(new Uf[] {Uf.AM, Uf.PA}), 
	NORDESTE(new Uf[] {Uf.PI, Uf.BA}),
	CENTRO_OESTE(new Uf[] {Uf.MT, Uf.MS}), 
	SUDESTE(new Uf[] {Uf.MG, Uf.SP}), 
	SUL(new Uf[] {Uf.PR, Uf.SC});
	
	private Uf[] ufs;
	
	private Regioes(Uf[] ufs) {
		this.ufs = ufs;
	}
	
	public Uf[] getUfs() {
		return ufs;
	}

}
