package br.com.sweepme.database;

public interface DBAdapter {

	public void executaSQL(String sql);

	public abstract void criaTabela(String nomeTabela, String... atributos);
}
