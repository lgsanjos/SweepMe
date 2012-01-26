package br.com.sweepme.database.versionamento;

public class DDLUsuario {

	private DDLUsuario() {
	}
	
	public static void criaTabelaUsuarios() {
		String[] atributos = {
				"nome TEXT", "apelido TEXT", "senha TEXT", "email TEXT",
				"facebook TEXT"
				};
		
		DDL.criaTabela("Usuarios", atributos);
	}	
}
