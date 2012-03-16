package br.com.sweepme.comunicacao;

import java.util.List;

import android.app.Activity;
import android.content.Intent;

public abstract class InterfaceExterna {
	
	private Intent intent;
	private Activity activity;
	
	public InterfaceExterna(Intent intent, Activity activity) {
		this.intent = intent;
		this.activity = activity;
	}
	
	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setactivity(Activity activity) {
		this.activity = activity;
	}

	public abstract List<String> getListaDeVizinhos();
	public abstract void setNomeDispositivo(String nome);
	public abstract String getNomeDispositivo();	
	public abstract void enviarMensagem(String mensagem, String destinatario);
	public abstract boolean isAtivado();
	public abstract boolean isDisponivel();
	public abstract void conectar();
}

