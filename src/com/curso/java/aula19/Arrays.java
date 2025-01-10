package com.curso.java.aula19;

public class Arrays {
	public static void main (String[] args) {
		
		double tempDia001=31.3;
		double tempDia002=32;
		double tempDia003=33.7;
		double tempDia004=34;
		double tempDia005=33.1;
		
		 double [] temperatura = new double[365];
		temperatura [0] = 31.3;		
		temperatura [1] = 32;
		temperatura [2] = 33.7;
		temperatura [3] = 34;
		temperatura [4] = 33.1;
		
		System.out.println ("O valor da temperatura do dia 1 é: " + temperatura [0]);
		
		System.out.println ("O tamanho do array: " + temperatura.length);
		
		System.out.println ("Valores do array: " );
		
		for (int i=0; i<temperatura.length; i++) {
			System.out.println ("O valor da temperatura do dia " + (i+1) + " é: " + temperatura [i]);
			
		}
		for (double temp: temperatura) {
			System.out.println(temp);
		}
		
	}
	

}