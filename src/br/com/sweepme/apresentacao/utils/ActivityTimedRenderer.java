package br.com.sweepme.apresentacao.utils;

import android.app.Activity;
import android.content.Intent;

public class ActivityTimedRenderer extends Thread {
	
	private Intent view;
	private int time;
	private Activity sender;
	
	public ActivityTimedRenderer(Activity sender, Intent view, int tempoDeEspera) {
		this.view = view;
		this.time = tempoDeEspera;
		this.sender = sender;
	}
	
	@Override
	public void run() {
		super.run();
		
		int waitingTime = 0;
		try {
			while (waitingTime < this.time) {
				sleep(100);
				waitingTime += 100;
			}
		} catch (InterruptedException e) {
		} finally {
			if (this.view != null)
				sender.startActivity(this.view);
		}
	}
}
