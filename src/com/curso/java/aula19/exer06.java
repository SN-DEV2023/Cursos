package com.curso.java.aula19;

import java.util.Scanner;

public class exer06 {
	 
	public static void main (String[] args) {
		
	Scanner scan = new Scanner(System.in);

	int[] vetorA = new int[5];
	int[] vetorB = new int[vetorA.length];
	int[] vetorC = new int[vetorA.length];
	
	 for (int i=0; i<vetorA.length; i++) {
		 System.out.println ("Entre com o valor da posiçã: " + i);
		 vetorA[i] = scan.nextInt();
	 }

	 for (int i=0; i<vetorB.length; i++) {
		 System.out.println ("Entre com o valor da posição: " + i);
		 vetorB[i] = scan.nextInt();
	 }
	 
	 for (int i=0; i<vetorC.length; i++) {
		 System.out.println ("Entre com o valor da posição: " + i);
		 vetorC[i] =  vetorA[i] + vetorB[i];
	 }
	  
	 //acabou aqui
	 
	
	System.out.println ("Vetor A= ");
	for (int i=0; i<vetorA.length; i++){
		System.out.println (vetorA[i]+ " ");
	}
	System.out.println ("Vetor B= ");
	for (int i=0; i<vetorB.length; i++){
		System.out.println (vetorB[i]+ " ");
	}
	System.out.println ("Vetor C= ");
	for (int i=0; i<vetorC.length; i++){
		System.out.println (vetorC[i]+ " ");
	}
	System.out.println();

}

}