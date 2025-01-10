package com.curso.java.aula17;

import java.util.Scanner;

public class Exer4Habitantes {
	public static void main(String[] args) {
	
	
	//Scanner scan= new Scanner (System.in);
	int PaisA= 80000;
	int PaisB=200000;
	int cont= 0;
	
	
	while(PaisA < PaisB ) {
		PaisA += (PaisA/ 100)* 3;
		PaisB+=  (PaisB/100)* 1.5;
		cont++;
	}
		
		System.out.println("Pais A: "+ PaisA);
		System.out.println("Pais B: "+ PaisB);
		System.out.println("Quantos Anos:"+ cont);
		
		

	
	
	}
}
