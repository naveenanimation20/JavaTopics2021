package Numbers;

/*
 * 
 */
public class AA {

	public static void main(String[] args) {

		int[] inputArray = { 92,12, 9, 7, 8, 6, 3, 14};

		int max = inputArray[inputArray.length - 1];
		System.out.print(max+" ");

		for (int i = inputArray.length - 2; i >= 0; i--) {

			if (inputArray[i] > max) {
				System.out.print(inputArray[i]+" ");
				max = inputArray[i];
				
			}

		}

	}

}
