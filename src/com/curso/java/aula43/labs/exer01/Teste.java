package com.curso.java.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {
		System.out.println("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumeroConta("11111");

		contaSimples.depositar(100);

		realizarSaque(contaSimples, 50);

		realizarSaque(contaSimples, 70);
		
		

		System.out.println(contaSimples);
		
		
		System.out.println("*** Teste ContaPoupança ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupança");
		contaPoupanca.setNumeroConta("22222");
		contaPoupanca.setDiaRendimento(25);

		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);

		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de= " + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		System.out.println(contaPoupanca);
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta Simples");
		contaEspecial.setNumeroConta("33333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);

		realizarSaque(contaEspecial, 50);

		realizarSaque(contaEspecial, 70);
		
		System.out.println(contaEspecial);
		
	}

	private static void realizarSaque(ContaBancaria conta, double valor) {

		if (conta.sacar(valor)) {
			System.out.println("saque efetuado com sucesso, novo saldo=" + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de =" + conta.getSaldo());
		}
	}

}
