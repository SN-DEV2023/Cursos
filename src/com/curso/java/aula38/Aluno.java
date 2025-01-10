package com.curso.java.aula38;

public class Aluno extends Pessoa{ 
	
	/*private String nome;
	private String endereco;
	private String telefone;
	private String cpf;*/
	private String curso;
	private double[] notas;
	
	
	
	public Aluno() {
		super();

	}
	public Aluno(String nome, String endereço, String teçefone, String curso) {
		super (nome, endereço,TelefoneCelular);
		this.curso= curso;
		
	}
	
	/*public String getNome() {
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
	}*/
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia () {
		return 0;
	
	}
	public boolean verificarAprovado() {
		return true;
	}
	public void métodoQualquer() {
		super.setCpf("515.628.418-05");
		this.setCpf("515.628.418-05");
		
		
	}
	
	
}





