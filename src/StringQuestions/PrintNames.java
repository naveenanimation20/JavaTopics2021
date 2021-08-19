package StringQuestions;

public class PrintNames {
	
	
	/**
	 * Print your name 1000 times without using any loop in your code
	 * 
	 */
	
	private static int counter = 1;

	public static void main(String[] args) {

		if (counter <= 100000) {
			System.out.println("Naveen");
			counter++;
			main(null);
		}
	}

//	public static void main(String[] args) {
//
//		
//		String name = "naveen";
//		String s = "i";
//		s = s.replaceAll("i", "iiiiiiiiii");//10
//		s = s.replaceAll("i", "iiiiiiiiii");//10x10 = 100
//		s = s.replaceAll("i", "iiiiiiiiii");//100x10 = 1000
//
//		s = s.replaceAll("i", name + "\n");
//		System.out.println(s);
//		
//		System.out.print(
//				String.format("%1000s", " ")
//				    .replace(" ", "Name\n") );
//		
//	}

}
