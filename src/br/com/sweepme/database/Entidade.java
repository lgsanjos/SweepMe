package br.com.sweepme.database;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Entidade {
		
	public Entidade() {
		super();
		this.database = DbFactory.criaDbAdapter();
	}
	
	private final DBAdapter database;
	private int id = 0;
	
	private String executaGetterDe(String nomeAtributo) {
		
		Method getter = null;
		for (Method metodo : this.getClass().getDeclaredMethods()) {
			if (metodo.getName().compareToIgnoreCase("get" + nomeAtributo) == 0) {
				getter = metodo;
			}
		}
		
		Object[] argumentos = { null }; 
		try {
			String resultado = ((String) getter.invoke(this, argumentos).toString());
			return resultado;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	protected abstract String getNomeTabela();
	protected abstract Map<String, String> getAtributos();
	
	protected void salvar() {
		String sql;
		
		if (this.getId() == 0) {
			sql = "INSERT INTO " + getNomeTabela() + " values (";
			for (Entry<String, String> atributo : getAtributos().entrySet()) {
				sql += " , "  + executaGetterDe(atributo.getKey());
			}
			sql += "";
			
		} else {
			sql = "";
		}
		
		this.database.executaSQL(sql);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
		
}
