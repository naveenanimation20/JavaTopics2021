package Patterns;

public class AlphabetPattern_2 {

	public static void main(String[] args) {

		//** Printing the Alphabet pattern... **

//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
//		F F F F F F
		
//		a 
//		b b 
//		c c c 
//		d d d d 
//		e e e e e 
//		f f f f f f 
		
		//A-Z : 65 to 90
		//a-z : 97 to 122
		int alpha = 65;
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				
				System.out.print((char)alpha + " ");
			}
			
			alpha++;
			System.out.println();
		}
		
		
	}

}
