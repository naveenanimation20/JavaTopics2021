package Numbers;

public class ArmstrongNumber {

	/**
	 * Check given number is an Armstrong Number / narcissistic Number/ pluperfect
	 * digital invariant (PPDI) Number/ plus perfect number
	 */

	public static boolean isArmStrongNumber(int num) {
		
		//153 = 1^3 + 5^3 + 3^3
		//153 = 1 + 125 + 27 = 153

		if (num < 0) {
			return false;
		}

		if (num >= 0 && num <= 9) {
			return true;
		}

		int power = power(num);
		int copyNum = num;
		int sum = 0;

		while (copyNum != 0) {
			int lastDigit = copyNum % 10;
			int factor = 1;
			for (int i = 0; i < power; i++) {
				factor = factor * lastDigit;
			}
			sum = sum + factor;
			// sum = (int) (sum + Math.pow(lastDigit, power));
			copyNum = copyNum / 10;
		}

		if (sum == num) {
			return true;
		}
		return false;
	}

	private static int power(int num) {
		int n = 0;
		while (num != 0) {
			n++;
			num = num / 10;
		}
		return n;
	}

	public static void main(String[] args) {

		System.out.println(isArmStrongNumber(0));
		System.out.println(isArmStrongNumber(1));
		System.out.println(isArmStrongNumber(9));
		System.out.println(isArmStrongNumber(-1));
		System.out.println(isArmStrongNumber(153));
		System.out.println(isArmStrongNumber(9474));
		System.out.println(isArmStrongNumber(1674));
		System.out.println(isArmStrongNumber(54748));

		System.out.println(isArmStrongNumber(12));
		System.out.println(isArmStrongNumber(100));

	}

}
