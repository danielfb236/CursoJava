package br.com.cliente.model;

public class Cliente {

	private int id;
	private String nome;
	private String sobreNome;
	private int idade;
	private String telefone;
	
	
	public Cliente() {
		
	}
	
	public Cliente (int id, String nome, String sobreNome, int idade, String telefone) {
		
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.telefone = telefone;
	}
		
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return this.sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNomeCompleto() {
		
		String nomeCompleto = "";
		
		if(!this.nome.equals("") && !this.sobreNome.equals("")) {
			nomeCompleto = this.nome + " " + this.sobreNome;
			}
		return nomeCompleto;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " Sobrenome: " + this.sobreNome + "Idade: " + this.idade + " Telefone: " + this.telefone;
	}
}

