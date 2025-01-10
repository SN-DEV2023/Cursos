package com.curso.java.aula28;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	Carro() {
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}

	Carro(String marca) {
		marca = marca;

	}

	void exibirAutonomia() { // boa prática Java é você sempre iniciar o método com um verbo, como "EXIBIR"
		System.out.println("A autonomia da moto é: " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double quantidadeCombustivel = km / consumoCombustivel;

		return quantidadeCombustivel;
	}

}
