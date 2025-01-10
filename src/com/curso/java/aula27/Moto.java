package com.curso.java.aula27;

public class Moto implements Veiculo{
	
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
	
	double calcularCombustivel (double km) {
		
		double quantidadeCombustivel= km/consumoCombustivel;
		
		return quantidadeCombustivel;
	}

	@Override
	public void deslocar(int distancia) {
		
		System.out.println("deslocou  " + distancia + " metros");
	}
	
	
	
}


