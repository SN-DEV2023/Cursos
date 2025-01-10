package com.curso.java.aula24;

public class Lista {
	public static void main (String[]args) {
		Contato contato1= new Contato();
		
		contato1.nome="Samuel";
		contato1.email="samucakauanscimento@gmail.com";
		contato1.endereço="Avelino Ginjo";
		
		contato1.telefones= new String [5];
		contato1.telefones[0]="11960428153";
		contato1.telefones[1]="11960428153";
		contato1.telefones[2]="11960428153";
		contato1.telefones[3]="11960428153";
		
		System.out.println(contato1.nome);
		System.out.println( contato1.email);
		System.out.println(contato1.endereço);
		System.out.println(contato1.telefones[0]);
		System.out.println(contato1.telefones[1]);
		System.out.println( contato1.telefones[2]);
		System.out.println(contato1.telefones[3]);
		
		
	}

}
