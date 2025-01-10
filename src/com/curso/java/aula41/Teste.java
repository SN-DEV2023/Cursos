 package com.curso.java.aula41;

import com.curso.java.aula40.Aluno;
import com.curso.java.aula40.Pessoa;
     

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num1");
		aluno.setEndereco("Rua 2, num2");
		professor.setEndereco("Rua 3, num3");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	

	}

}
