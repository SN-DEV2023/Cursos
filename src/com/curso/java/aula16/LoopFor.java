package com.curso.java.aula16;

public class LoopFor {
	
	public static void main (String [] args) {
		
		int i = 1;
	
		System.out.println(++i);
		System.out.println(i);
		
		//loop sem corpo
		int soma = 0;
		for ( int i1=1; i1< 5; soma+= i1++);
		System.out.println ("O valor da soma é " + soma);
		
		
		for(int u=0; u < 5 ; u++) {
			System.out.println ("i tem valor: "+ u);{
				
				for(int b=5; b > 0 ; b--) {
					System.out.println ("i tem valor: "+ b);
					
					for (int c=0, j=10 ; c < j; c++, j--){
						System.out.println ("i =" + i +"; j" + j);
					}
					
				int count =0;
				for (; count <10 ;) {
					System.out.println ("valor de count:" + count);
					count += 2;
				}
				for (int cont= 0; cont < 10; cont+= 2 ){
					System.out.println ("valor de cont" + cont);
				
				
				}
		
			
	        }
	        
			}
		}

	}
	
}
