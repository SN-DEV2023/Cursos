package com.curso.java.aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {

		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 2 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parâmetros");
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
