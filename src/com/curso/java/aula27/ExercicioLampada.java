
package com.curso.java.aula27;

public class ExercicioLampada {
	String modelo;
	String tensao;
	int potencia;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
		void mudarEstado() {
			if (ligada){
				desligar();
			}else {
				ligar();
				
			}
		}
	
}
