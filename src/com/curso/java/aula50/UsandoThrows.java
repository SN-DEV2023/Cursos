package com.curso.java.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um número decimal");
		try {
			double numero = lerNumero();
			System.out.println("Você digitou " + numero);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}

	public static double lerNumero() throws Exception {
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
		return numero;
	}
}
