package br.com.sweepme.database;

import java.util.Map;
import java.util.Map.Entry;


public abstract class Entidade {
	
	final private DBAdapter database;

	public Entidade() {
		super();
		this.database = DbFactory.criaDbAdapter();
	}
	
	protected abstract String getNomeTabela();
	protected abstract Map<String,String> getAtributos();
	
	private String montaSqlCreateTable() {
		String sql;
		sql  = "CREATE TABLE " + getNomeTabela();
		sql += "( ";
		sql += "id integer primary key autoincrement";
		for (Entry<String,String> atributo : getAtributos().entrySet()) {
			sql += ", " +  atributo.getKey() + " " + atributo.getValue();
		}
		sql += ");";
		
		return sql;
	}
	
	protected boolean createTable() {		
		database.executaSQL(montaSqlCreateTable());
		return false;
	}
}
