package com.curso.java.aula42;

public class Teste {
	public static void main (String [] args) {
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno= new Aluno();
		Professor professor = new Professor();
		
		System.out.println(Constantes.URL_BLOG);
		Constantes.URL_BLOG="dvsdfsd"; 
		
		final int TOTAL= 1;
		//total = total= 1;
		System.out.println(TOTAL);
	}
		
}
