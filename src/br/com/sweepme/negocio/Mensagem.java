package br.com.sweepme.negocio;

import java.security.Timestamp;

public class Mensagem {
	
	private Usuario remetente;
	private Usuario destinatario;
	private String texto;
	private Timestamp dataEnvio;
	private Timestamp dataRecebido;
	
	public Usuario getRemetente() {
		return remetente;
	}
	public Usuario getDestinatario() {
		return destinatario;
	}
	public String getTexto() {
		return texto;
	}
	public Timestamp getDataEnvio() {
		return dataEnvio;
	}
	public Timestamp getDataRecebido() {
		return dataRecebido;
	}
	
	

}
