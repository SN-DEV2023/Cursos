package com.curso.java.aula17;

import java.util.Scanner;

public class Exer2SenhaUsuario {

	public static void main (String []args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean infoValidas= false;  
		String nomeUser;
		String senha;
		int samuel ;
		
		
		
		do {
			
			System.out.println ("Entre com o nome do usuário");
			nomeUser = scan.next ();
			
			System.out.println ("Entre com a senha");
			senha = scan.next ();
			
			if(nomeUser.equalsIgnoreCase(senha)) {
				//infoValida= false;
				System.out.println ("Senha igual a usuário, digite novamente.");
				
			} else {
					infoValidas = true;
					System.out.println ("Senha e usuários válidos.");
			}
				
		} while (!infoValidas);
	
	}
}
	