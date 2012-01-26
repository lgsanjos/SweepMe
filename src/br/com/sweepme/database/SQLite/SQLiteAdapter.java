package br.com.sweepme.database.SQLite;

import android.database.sqlite.SQLiteDatabase;
import br.com.sweepme.database.DBAdapter;

public class SQLiteAdapter implements DBAdapter {

	private final SQLiteDatabase database;
	private final String databaseFileName = "SweepMe.db";
	
	public SQLiteAdapter() {
		super();
		this.database = SQLiteDatabase.openOrCreateDatabase (databaseFileName, null);
	}
	
	@Override
	public void executaSQL(String sql) {
		database.execSQL(sql);
	}
	
	@Override
	public void criaTabela(String nomeTabela, String... atributos) {
		String sql;
		sql  = "CREATE TABLE " + nomeTabela;
		sql += "( ";
		sql += "id integer primary key autoincrement";
		for (String atributo : atributos) {
			sql += ", " +  atributo + " ";
		}
		sql += ");";
		
		database.execSQL(sql);
	}
	
	public void removeTabela(String nomeTabela) {
		String sql = "DROP TABLE " + nomeTabela;
		database.execSQL(sql);
	}
	
	public void atualizaTabela(String nomeTabela, String... alteracoes) {
		String sql = "ALTER TABLE " + nomeTabela;
		
		database.execSQL(sql);
	}	

}
