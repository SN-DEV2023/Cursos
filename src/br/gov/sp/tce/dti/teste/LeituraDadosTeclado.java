package br.gov.sp.tce.dti.teste;

import java.util.Scanner;

public class LeituraDadosTeclado {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
	
	System.out.println("Digite seu nome completo: ");
	String nomeCompleto=scan.nextLine();
	
	System.out.println ("Seu Nome Completo é: " + nomeCompleto);
	System.out.println ("Digite seu primeiro nome: " );
	String PrimeiroNome = scan.next ();
	System.out.println("Seu primeiro nome é: " + PrimeiroNome);

	
	System.out.println ("Digite sua idade: ");
    int idade = scan.nextInt();
	System.out.println("Sua idade é:" + idade);
	
  
   /*
	Scanner scan = new Scanner (System.in);
	System.out.println("Digite o seu primeiro nome, idade, qunatidade de filhos, altura e se tem pet");
	String primeiroNome1= scan.next();
	int idade2= scan.nextInt ();
	byte quantidadeFilhos =scan.nextByte ();
	float altura = scan.nextFloat ();
	boolean temPet = scan.nextBoolean ();
	
	System.out.println ("Você digitou os seguintes valores:");
	System.out.println ("QuantidadeFilhos: "+ quantidadeFilhos);
	System.out.println ("Altura: " + altura);
	System.out.println ("TemPet "+ temPet);
	
	 */
	
	}

}
