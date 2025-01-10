package com.curso.java.aula43;

public class Teste {
	public static void main (String[] args) {
		
		Aluno aluno = new Aluno();
		//Aluno aluno2;
		
		//aluno2 = aluno;
		
		
		
		aluno.setCurso("Ciencia da Computação");
		double [] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1= "samuel";
		String s2= "samuel";
		
		System.out.println(s1.equalsIgnoreCase(s2));
	
		Aluno aluno2= new Aluno(); 
		
		aluno2.setCurso("Ciencia da Computação");
		double [] notas2 = {5,10,8,6};
		aluno.setNotas(notas2);
		
		System.out.println(aluno.equals(notas2));
		
		
	}

}
