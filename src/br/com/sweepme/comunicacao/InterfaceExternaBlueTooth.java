package br.com.sweepme.comunicacao;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;

public class InterfaceExternaBlueTooth extends InterfaceExterna {
	
	public InterfaceExternaBlueTooth(Intent intent, Activity activity) {
		super(intent, activity);
		this.bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	}

	private BluetoothAdapter bluetoothAdapter;
	
	@Override
	public List<String> getListaDeVizinhos() {
		Set<BluetoothDevice> pairedDevices = this.bluetoothAdapter.getBondedDevices();
	    LinkedList<String> listagem = new LinkedList<String>();
		
		for (BluetoothDevice device : pairedDevices) {
	        listagem.add(device.getName());
	    }
		
		return listagem;
	}

	@Override
	public void setNomeDispositivo(String nome) {
		this.bluetoothAdapter.setName(nome);
	}

	@Override
	public String getNomeDispositivo() {
		return this.bluetoothAdapter.getName();
	}

	@Override
	public void enviarMensagem(String mensagem, String destinatario) {
		
	}

	@Override
	public boolean isAtivado() {
		return this.bluetoothAdapter.isEnabled();
	}

	@Override
	public boolean isDisponivel() {
		return (BluetoothAdapter.getDefaultAdapter() != null);
	}

	@Override
	public void conectar() {
		final int REQUEST_ENABLE_BT = 2;
				
		if (isDisponivel() && !isAtivado()) {
		    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
		    getActivity().startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
		}
	}

}
