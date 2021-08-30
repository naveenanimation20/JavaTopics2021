package ArrayQuestions;

/**
 * Find out all the leader elements in a given array
 * 
 * @author naveenautomationlabs
 *
 */
public class LeaderElements {

	public static void findLeadears(int num[]) {

		if (num.length == 0) {
			return;
		}

		if (num.length == 1) {
			System.out.println(num[0]);
			return;
		}

		int max = num[num.length - 1];
		System.out.print(max + " ");

		for (int i = num.length - 2; i >= 0; i--) {

			if (num[i] > max) {
				System.out.print(num[i] + " ");
				max = num[i];
			}

		}

	}

	public static void main(String[] args) {
//		int num[] = { 92, 7, 12, 9, 8, 3 };
//		findLeadears(num);
//		System.out.println();
//		int num1[] = { 92, 11, 10, 9, 8, 14 };
//		findLeadears(num1);
//		System.out.println();
//		int num2[] = { 92, 11, 10, 9, 8, 14, 3,3 };
//		findLeadears(num2);
//		
//		System.out.println();
//		int num3[] = { 9, 11, 10, 9, 8, 14, 3,3 };
//		findLeadears(num3);

		System.out.println();
		int num4[] = {};
		findLeadears(num4);

		System.out.println();
		int num5[] = { 9, 9, 9, 9, 9, 9 };
		findLeadears(num5);

	}

}
