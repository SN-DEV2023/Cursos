package com.curso.java.aula53.Enum;

public enum DiaSemana {
	
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	DiaSemana(int valor) {
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}
	public int getValor() {
		return this.valor;
	}
	
}
