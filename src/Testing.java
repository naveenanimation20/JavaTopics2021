import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Testing {

	public static void main(String[] args) {

		String inputString = "naveen automation labs          " + "\n testing          automation" + "\n community"
				+ "\n f r a m e w o r k";

		String myArr[] = inputString.split("\\s");
		StringBuffer newStr = new StringBuffer();
		for (String s : myArr) {
			newStr.append(s);
		}
		System.out.println(newStr);
		System.out.println(newStr);
		System.out.println("hello world");

		System.out.println(0.1 + 0.2);
		System.out.println(0.1 + 0.3);

		System.out.println("hello naveen");
		int i = 10;

		//
		//
		// String stringWithoutSpaces = "";
		//
		// for (int i = 0; i < inputString.length(); i++) {
		// if ((inputString.charAt(i) != ' ') && (inputString.charAt(i) !=
		// '\t')) {
		// stringWithoutSpaces = stringWithoutSpaces + inputString.charAt(i);
		// }
		// }
		//
		// System.out.println("Input String : " + inputString);
		//
		// System.out.println("Input String Without Spaces : " +
		// stringWithoutSpaces);
		//
		// String finalString = StringUtils.deleteWhitespace("naveen automation
		// labs" + "testing" + "community");
		// System.out.println(finalString);

	}

}
