package com.curso.java.aula20;

import java.util.Random;

public class exer01 {
	public static void main (String [] args) {
		
		        int[][] numerosAleatorios= new int [10] [10];
		        
		        Random numeroRandom= new Random();
		        
		        for (int i=0; i < numerosAleatorios.length; i++){
		    for ( int j=0; j < numerosAleatorios[i].length; j++) {
		        numerosAleatorios[i][j]= numeroRandom.nextInt(100);

		            }
		        }
		        for ( int i=0; i<numerosAleatorios.length; i++){
		            for (int j=0; j < numerosAleatorios[i].length; j++);
		            		int j;
							System.out.println(numerosAleatorios[i][j] + " ");
		        }
		        System.out.println();
		    }

	int maiorL5 =0;
	int menorL5 =0;
	int linha
	for (i=0; i<numerosAleatorios[5].length; i++){
	if (numerosAlaetorios[5][i] > maiorL5) {
		maiorL5 = numerosAleatorios[i]ji];
	}
		
		if (numerosAleatorios[linhas5][i] < menorL5) {
			menorL5 = numerosAleatorios[linha5][i];
		}
	}System.out.println("Maior valor da linha 5="+maiorL5);System.out.println("Menor valor da linha 5="+maiorL5);
}
