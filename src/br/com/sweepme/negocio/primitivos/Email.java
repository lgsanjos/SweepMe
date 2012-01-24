package br.com.sweepme.negocio.primitivos;

public class Email {
	
	private String email;
		
	public String getEmail() {
		return email;
	}
	
	private void valida(String email) {
		
	}

	public Email(String email) {
		this.valida(email);
		this.email = email;
	}

}
