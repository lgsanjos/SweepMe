package br.com.sweepme.database.versionamento;

import br.com.sweepme.database.DBAdapter;
import br.com.sweepme.database.DbFactory;

public final class DDL {

	private final DBAdapter database;
	
	private DDL() {
		super();
		this.database = DbFactory.criaDbAdapter();
	}
	
	private static DDL getInstancia() {
		return new DDL();
	}
	
	public static void criaTabela(String nomeTabela, String... atributos) {
		getInstancia().database.criaTabela(nomeTabela, atributos);
	}

}
