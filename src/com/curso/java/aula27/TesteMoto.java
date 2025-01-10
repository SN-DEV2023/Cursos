package com.curso.java.aula27;

public class TesteMoto {

	public static void main(String[] args) {
		Moto esportiva = new Moto();
		esportiva.marca = "Honda";
		esportiva.modelo = "XRE300";
		esportiva.numPassageiros = 2;
		esportiva.capCombustivel = 13.8;
		esportiva.consumoCombustivel = 1;

		System.out.println(esportiva.marca);
		System.out.println(esportiva.modelo);
		System.out.println(esportiva.numPassageiros);
		System.out.println(esportiva.capCombustivel);
		System.out.println(esportiva.consumoCombustivel);

		System.out.println();

		Moto corrida = new Moto();
		corrida.marca = "kasinski";
		corrida.modelo = "Comet 250";
		corrida.numPassageiros = 2;
		corrida.capCombustivel = 13.8;
		corrida.consumoCombustivel = 1;

		System.out.println(corrida.marca);
		System.out.println(corrida.modelo);
		System.out.println(corrida.numPassageiros);
		System.out.println(corrida.capCombustivel);
		System.out.println(corrida.consumoCombustivel);

		esportiva.exibirAutonomia();

		double autonomia = esportiva.obterAutonomia();
		System.out.println("A autonomia da moto é: " + autonomia);
		System.out.println("A autonomia da moto é: " + esportiva.obterAutonomia());

		double quantidadeCombustivel10 = esportiva.calcularCombustivel(10);
		double quantidadeCombustivel15 = esportiva.calcularCombustivel(15);

		System.out.println("quantidadeCombustivel10 = " + quantidadeCombustivel10);
		System.out.println("quantidadeCombustivel15 = " + quantidadeCombustivel15);
	
	
		Veiculo veiculo= esportiva;
		veiculo.deslocar(100);
	
	}

}
