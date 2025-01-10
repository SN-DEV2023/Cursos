import java.util.Scanner;

public class Aula4 {
	public static void main (String [] args) {
		
		Scanner scan= new Scanner(System.in); 
		
		System.out.println ("Entre com a primeira nota");
		double nota1= scan.nextDouble();
		
		System.out.println ("Entre com a segunda nota");
		double nota2= scan.nextDouble();
		
		System.out.println ("Entre com a terceira nota");
		double nota3= scan.nextDouble();
		
		System.out.println ("Entre com a quarta nota");
		double nota4= scan.nextDouble();
		
		double media= (nota1 + nota2 + nota3 + nota4)/4;
				
		System.out.println("A média é: " + media);
		
		
	}
}



/*	
Scanner scan= new Scanner (System.in);

System.out.println("Entre com o número de habitantes");
int PaisA= scan.nextInt();
int crescimento;

System.out.println("Entre com a taxa de crescimento do números de habitantes");
float PaisB= scan.nextFloat();

//int PaisB=;
int cont= 0;


while(PaisA < PaisB ) {
	int taxaDeCrescimento;
//	PaisA += (PaisA/ 100)* taxaDeCrescimento;
//	PaisB+=  (PaisB/100)* ;
	cont++;
}
	
	System.out.println("Pais A: "+ (PaisA / 100) * PaisB);
	System.out.println("Pais B: "+ PaisB);
	System.out.println("Quantos Anos:"+ cont);
	
	
}
}

*/