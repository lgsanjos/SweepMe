package br.com.sweepme.database;

import br.com.sweepme.database.SQLite.SQLiteAdapter;

public class DbFactory {

	private DbFactory() {
	}
	
	public static Adapter criaDbAdapter() {
		return new SQLiteAdapter();
	}
}
