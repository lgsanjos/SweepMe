package br.com.sweepme.negocio;

import br.com.sweepme.negocio.primitivos.Email;
import br.com.sweepme.negocio.primitivos.Link;
import br.com.sweepme.negocio.primitivos.Senha;

public class Usuario {
	
	private String nome;
	private String apelido;
	private Email email;
	private Senha senha;
	private Link enderecoFacebook;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getEmail() {
		return email.getEmail();
	}
	
	public void set4Email(String email) {
		this.email = new Email(email);
	}
	
	public String getSenha() {
		return senha.getSenha();
	}
	
	public void setSenha(String senha) {
		this.senha = new Senha(senha);
	}
	
	public String getEnderecoFacebook() {
		return enderecoFacebook.getLink();
	}
	
	public void setEnderecoFacebook(String enderecoFacebook) {
		this.enderecoFacebook = new Link(enderecoFacebook);
	}
	
	public static boolean validaUsuario(String nome, String senha) {
		
		return false;
	}
	
	public static boolean carregaUsuario(String nome, String senha) {
		if (validaUsuario(nome, senha)) {
		}	
		
		return false;
	}	
	

}
