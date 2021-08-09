package StringQuestions;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Print 1 to 100 without using loop and recursion
 * @author naveenautomationlabs
 *
 */


public class PrintNumbers {

	public static void main(String[] args) {
		
	

		//1. Arrays fill:
		Object num[] = new Object[100];
		
		Arrays.fill(num, new Object() {
			int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
		System.out.println(Arrays.toString(num));
		
		System.out.println();
		
		//2. BitSet:
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set, 1, set.length());
		
		
	}

}
