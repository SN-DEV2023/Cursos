package com.curso.java.aula42;

public final class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	private String telefoneCelular; 
	
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() {
		return endereco;
		
	}
	
	//public abstract String obterEtiquetaEndereco1();
	
	//public abstract void imprimirEtiquetaEndereco();
	




	}
