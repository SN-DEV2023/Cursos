package com.curso.java.aula17;

import java.util.Scanner;

public class Exer5MudançaTaxaPop {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		 
		/*
		System.out.println ("Digite o número de habitantes");
		int numeroDeHabitantes= scan.nextInt();
		

		System.out.println ("Insira o número da taxa de crescimento populacional");
		float taxaDeCrescimento= scan.nextFloat();
		
		System.out.println ("Quantos anos você quer projetar o crescimento da população?");
		int emQtsAnos= scan.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		System.out.println ("Crescimento de: " + emQtsAnos + (numeroDeHabitantes * taxaDeCrescimento) );
		
		
		
		*/
		
		

		boolean valido = false;
		double PaisA;
		double PaisB;
		double taxaA;
		double taxaB;
		
		
		do {
			
			System.out.println ("Entre com a população do Brasil: ");
			PaisA = scan.nextDouble();
			if (PaisA > 0) {
				valido = true;
				
			}else {
				System.out.println ("População A precisa ser maior que 0. ");
			}
			
			
			
		} while (!valido);
		
		
		valido= false;
		do {
			
			System.out.println ("Entre com a população da China: ");
			PaisB= scan.nextDouble();
			if (PaisB > 0) {
				valido = true;
				
			}else {
				System.out.println ("População B precisa ser maior que 0. ");
			}
			
			
			
		} while (!valido);
		
		
		valido= false;
		do {
			
			System.out.println ("Entre com a taxa de crescimento da população do Brasil: ");
			taxaA= scan.nextDouble();
			if (taxaA> 0) {
				valido = true;
				
			}else {
				System.out.println ("Entre com a taxa de crescimento da população do Brasil: ");
			}
			
			
			
		} while (!valido);
		
		valido= false;
		do {
			
			System.out.println ("Entre com a taxa de crescimento da popupação da China: ");
			taxaB= scan.nextDouble();
			if (taxaB > 0) {
				valido = true;
				
			}else {
				System.out.println ("Entre com a taxa de crescimento da popupação da China: ");
			}
			
			
			
		} while (!valido);
		
		
		
		
		
		
		int cont= 0;
		
		
		while(PaisA < PaisB ) {
			
			PaisA += (PaisA/ 100)* taxaA;
			PaisB+=  (PaisB/100)* taxaB;
			cont++;
		}
			
			System.out.println("Pais A: "+ PaisA);
			System.out.println("Pais B: "+ PaisB);
			System.out.println("Quantos Anos:"+ cont);
			
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
