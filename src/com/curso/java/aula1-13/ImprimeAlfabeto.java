import java.util.Random;

public class ImprimeAlfabeto {

	public static void main(String[] args) {
		char letra = 'A';
		int cont=0;
		char[] arrLetras=new char[26];
		do {
			
			arrLetras [cont] = letra ;	
			letra++;
			cont++;
			
		}while(letra <= 'Z');

		System.out.println(arrLetras);
	}
	
}
			
		
		

//colocar a ordem alfabetica numerada em Array
	



