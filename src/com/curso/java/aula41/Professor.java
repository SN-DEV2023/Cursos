package com.curso.java.aula41;

public class Professor  extends Pessoa{
	
	/*private String nome;
	private String endereco;
	private String telefone;
	private String cpf;*/
	private double salario;
	private String nomeCurso;
	
	/*
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
	}*/
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	public String obterEtiquetaEndereco() {
		String s = "Endereco do professor: ";
		s += this.getEndereco();
		
		return s;

	}
	
public void imprimirEtiqutaEndereco() {
		
	    System.out.println("Imprimindo endereco do Professor");
		System.out.println(this.obterEtiquetaEndereco());
	}
@Override
public String obterEtiquetaEndereco1() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void imprimirEtiquetaEndereco() {
	// TODO Auto-generated method stub
	
}
	
}
