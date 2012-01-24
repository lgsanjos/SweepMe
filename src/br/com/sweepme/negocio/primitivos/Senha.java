package br.com.sweepme.negocio.primitivos;

public class Senha {
	
	private String senha;

	public String getSenha() {
		return senha;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Senha) {
			return ((Senha) o).senha.compareTo(this.senha) == 0; 
		}
		
		return super.equals(o);
	}

	public Senha(String senha) {
		super();
		this.senha = senha;
	}
	
	

}
