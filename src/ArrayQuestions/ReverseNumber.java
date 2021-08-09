package ArrayQuestions;

public class ReverseNumber {

	// Reverse a Number using recursion:
	public static void rev(long number) {

		if (number < 10 && number >= 0) {
			System.out.println(number);
			return;
		} else if (number < 0) {
			if (number >= -1 && number > -10) {
				System.out.println(number);
				return;
			}
			number = number * -1;
			System.out.print("-" + (number % 10));
			rev(number / 10);
		}

		else {
			System.out.print(number % 10);
			rev(number / 10);
		}

	}

	public static void main(String[] args) {
		rev(-001);
		rev(12345);
		rev(111);
		rev(123909888);
		rev(12898776543453l);
		rev(001);
		rev(100);
		rev(0);

//		int num = 12345;
//		while (num > 0) {
//			int rev = num % 10;
//			System.out.print(rev);
//			num = num / 10;
//		}

	}

}
