package Numbers;

/**
 * WAP to convert String to integer without using Integer.parseInt() method
 * 
 * @author naveenautomationlabs
 *
 */
public class StringToInteger {

	public static int stringToNumber(String str) {
		if(str.length() == 1) {
			return (int)str.charAt(0)-48;
		}

		int num = 0;
		int len = str.length();// 3
		for (int i = 0; i < len; i++) {
			// formula:
			num = num * 10 + ((int) str.charAt(i) - 48);// 0+1=1, 10 + 2= 12, 120+3 = 123
		}
		return num;
	}

	public static int convertToInt(String str) {
		
		if(str.length() == 1) {
			return (int)str.charAt(0)-48;
		}

		char ch[] = str.toCharArray();
		int sum = 0;
		int zeroAsc = (int) '0';// 48
		for (int i = 0; i < ch.length; i++) {
			int asc = (int) ch[i];
			sum = sum * 10 + (asc - zeroAsc);
		}
		return sum;

	}

	public static void main(String[] args) {

		String s = "9";
//		System.out.println(stringToNumber(s) + 10);
		System.out.println(convertToInt(s) + 20);

	}

}
