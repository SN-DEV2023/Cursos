package com.curso.java.aula19;

import java.util.Scanner;

public class Exer02 {

public static void main (String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	int [] vetorA = new int [8];
	int []vetorB = new int [vetorA.length];
	
	for (int i = 0; i< vetorA.length; i++) {
		
		System.out.println("Entre com o valor da posição:" + i );
		
		vetorA[i] = scan.nextInt();
		
		vetorB [i] = vetorA [i] *2;
		
		//System.out.println + vetorA + vetorB * 2 ;
	    }
	
	}

}

