package com.curso.java.aula31;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	public Carro() {
		super();
	}


	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {

		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	
	void exibirAutonomia() { // boa prática Java é você sempre iniciar o método com um verbo, como "EXIBIR"
		System.out.println("A autonomia da moto é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double quantidadeCombustivel = km / this.consumoCombustivel;

		return quantidadeCombustivel;
	}


}
