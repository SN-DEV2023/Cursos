package com.curso.java.aula45;


public class Aluno extends Pessoa{ 
	
	/*private String nome;
	private String endereco;
	private String telefone;
	private String cpf;*/
	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
		
		this.nomeVisibilidade = "xfghd";
		super.nomeVisibilidade = "dfsadf";
		
		this.setNomeVisibilidade(nomeVisibilidade);
	}
	
	private void setNomeVisibilidade(String nomeVisibilidade) {
		// TODO Auto-generated method stub
		
	}

	public Aluno() {
		super();

	}
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super (nome, endereco,telefone);
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
	

	public String obterEtiquetaEndereco() {
		String s = "Endereco do Aluno: ";
		s += this.getEndereco();
		
		return s;
		
	
	}

	public void imprimirEtiquetaEndereco() {
		// TODO Auto-generated method stub
		
	}
	
	
}




