package Patterns;

public class AlphabetPattern {

	public static void main(String[] args) {


		//** Printing the Alphabet pattern... **
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F

		int alpha = 65;
		//65 -- A
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alpha+j) + " ");
																 	
			}
			System.out.println();
		}
		
		
		

	}

}
