
package com.curso.java.aula14;

import java.util.Scanner;

public class ifElse {
	public static void main (String[] args){
		
	Scanner scan= new Scanner(System.in); 
	 
		    System.out.println ("Entre com a idade");
		
		int idade = scan.nextInt();
		
		if (idade >= 18){
			System.out.println ("É: " );	
		}else {
			System.out.println ("Menor de idade. ");
		}
		
		
		
		/*System.out.println ("Entre com o preço do item");
		double valor= scan.nextDouble();
		
		if (valor<=10){
		System.out.println ("Está no precinho, pode comprar");
		}else if (valor > 10 && valor <15) {
			System.out.println("Você pode pedir um desconto");
		}else if(valor>=15 && valor <17) {
			System.out.println ("Pesquise nais");
		}else {//valor >=17
			System.out.println ("Muito caro, o cara é mercenario");
		}
	*/
	}
}

 






//else (idade <= 18) 