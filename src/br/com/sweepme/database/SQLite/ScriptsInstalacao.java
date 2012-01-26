package br.com.sweepme.database.SQLite;

import br.com.sweepme.database.DBAdapter;
import br.com.sweepme.database.DbFactory;
import br.com.sweepme.database.versionamento.DDLUsuario;

public class ScriptsInstalacao {
	
	final private DBAdapter database;
	
	private ScriptsInstalacao() {
		this.database = DbFactory.criaDbAdapter();
		createTable();
		instalaScripts();
	}
	
	private String createTableSQL() {
		String sql;
		sql  = "CREATE TABLE versionamento (";
		sql += "id integer primary key autoincrement";
		sql += ", id integer";
		sql += ", grupo TEXT";
		sql += ", numero integer";
		sql += ");";
		
		return sql;
	}
	
	private void createTable() {		
		database.executaSQL(createTableSQL());
	}
	
	private void instalaScripts() {
		
		DDLUsuario.criaTabelaUsuarios();
		
	}

}
