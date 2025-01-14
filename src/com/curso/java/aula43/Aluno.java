package com.curso.java.aula43;

import java.util.Arrays;
import java.util.Objects;

import com.curso.java.aula39.Pessoa;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();

	}

	public Aluno(String nome, String endereco, String telefone, String curso) {

		this.curso = curso;

	}

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

	public double calcularMedia() {
		return 0;

	}

	public boolean verificarAprovado() {
		return true;
	}

	public void métodoQualquer() {
		// super.setCpf("515.628.418-05");
		// this.setCpf("515.628.418-05");

	}

	public String obterEtiquetaEndereco() {
		String s = "Endereco do Aluno: ";
		// s += this.getEndereco();

		return s;

	}

	public void imprimirEtiqutaEndereco() {

		System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		/*if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false; */
		

		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}

	/*
	 * public String toString() { String s = curso +"\n" ; for (double nota : notas)
	 * { s += nota + " "; } return s; }
	 */

}
