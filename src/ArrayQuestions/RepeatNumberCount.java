package ArrayQuestions;

import java.util.HashMap;
import java.util.Set;

public class RepeatNumberCount {

	// 121 --> 1:2, 2:1
	// 111 --> 1: 3

	public static void getDigitCount(long number) {
		
		if(String.valueOf(number).length()==1) {
			System.out.println(number +" : "+ 1);
			return;
		}

		HashMap<Long, Integer> digitMap = new HashMap<Long, Integer>();

		while (number != 0) {//12

			long lastDigit = number % 10;//1%10--> 1
			if (digitMap.containsKey(lastDigit)) {
				digitMap.put(lastDigit, digitMap.get(lastDigit) + 1);
			} else {
				digitMap.put(lastDigit, 1);//<1,2><2,1>
			}

			number = number / 10;//12/10-->1

		}
		
		Set<Long> keys = digitMap.keySet();
		for(Long key : keys) {
			System.out.println(key + " : " + digitMap.get(key));
		}

	}

	public static void main(String[] args) {
		getDigitCount(-12187876666L);
	}

}
