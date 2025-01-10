package com.curso.java.aula24;

public class Moto {
	
	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() { //boa prática Java é você sempre iniciar o método com um verbo, como "EXIBIR"
    System.out.println ("A autonomia da moto é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		
		System.out.println ("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
		
		
	}
	
}
