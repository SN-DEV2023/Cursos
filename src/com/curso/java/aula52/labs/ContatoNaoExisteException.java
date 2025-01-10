package com.curso.java.aula52.labs;

import java.security.PublicKey;

public class ContatoNaoExisteException extends Exception {
	
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
		public String getMessege() {
			return "Contato" + nomeContato + "não existe na agenda!";	
		}
	}

