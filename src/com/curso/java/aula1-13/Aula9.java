import java.util.Scanner;

public class Aula9 {
public static void main (String[] args) {
	
	Scanner scan= new Scanner (System.in);
	
	System.out.println ("Entre com a temperatura e Farenheit:");
	
	double f= scan.nextDouble();
	double c= (5* (f-32)/9);
	
	System.out.println("A temperatura" + f + "f é igual a " +c+ "c");
	
	
	
	
	
	
	
	
}
}
