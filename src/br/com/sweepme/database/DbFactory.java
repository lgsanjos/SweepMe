package br.com.sweepme.database;

import br.com.sweepme.database.SQLite.SQLiteAdapter;

public class DbFactory {

	private DbFactory() {
	}
	
	public static DBAdapter criaDbAdapter() {
		return new SQLiteAdapter();
	}
}
