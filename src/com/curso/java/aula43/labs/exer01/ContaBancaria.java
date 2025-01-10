package com.curso.java.aula43.labs.exer01;

public class ContaBancaria {

	private String nomeCliente;
	private String numeroConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numConta) {
		this.numeroConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		String s = "ContaBancaria[";
		s += " nomeCliente: " + nomeCliente;
		s += " numeroConta: " + numeroConta;
		s += " saldo: " + saldo;
		s += "]";
		return s;

		// return super.toString();
	}

	public void depositar(double valor) {
		saldo += valor;

	}

	public boolean sacar(double valor) {
		if ((saldo - valor) >= 0) {
			saldo -= valor;
			return true;
		}
		return false;

	}

}
