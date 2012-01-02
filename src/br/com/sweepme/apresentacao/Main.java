package br.com.sweepme.apresentacao;

import br.com.sweepme.apresentacao.utils.ActivityTimedRenderer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Main extends Activity {
	
    private void abreMenuPrincipal() {
    	Intent menu = new Intent(this, MenuPrincipal.class);
    	new ActivityTimedRenderer(this, menu, 3500).start();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        this.abreMenuPrincipal();
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	
    }
    
}
