package Stack;

public class PrintNumbers {

	static int count = 1;

	public static void printNum() {

			if (count <= 100000) {
				System.out.println("Hello");
				count++;
				printNum();
			}
		

	}

	public static void main(String[] args) {
		printNum();
		System.out.println("bye....");
	}

}
