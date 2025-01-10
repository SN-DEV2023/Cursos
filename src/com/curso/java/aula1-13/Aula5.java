import java.util.Scanner;

public class Aula5 {
 public static void main (String[] args) {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println ("Entre com a quatidade de metros");
	 double metros = scan.nextDouble ();
	 
	 //1m =100cm
	 double cm= metros *100;
	 
	 System.out.println (metros + "m é igual a " + cm + "cm");
	 }
}




//coloque um peso máximo e quanto irá ser pago por 