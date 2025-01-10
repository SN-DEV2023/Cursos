package com.curso.java.aula52;

import org.w3c.dom.NamedNodeMap;

public class DivisaoNaoExata extends Exception{
	
	private int numero;
	private int denominador;
	public DivisaoNaoExata(int numero, int denominador) {
		super();
		this.numero = numero;
		this.denominador = denominador;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Resultado de " + numero + "/" + denominador + "não é um inteiro!";
	}
}
