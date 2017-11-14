package br.com.cliente.model;

public class Usuario {

	private String usuario;
		
	private String senha;
	
	private String login;

	public Usuario (String usuario, String senha, String login) {
		this.usuario = usuario;
		this.senha = senha;
		this.login = login;
			
	}
	
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


			
}
