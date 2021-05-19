package ArrayQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import com.google.common.math.Stats;

/**
 * Calculate average of array using :
 * simple loop, 
 * Java 8 and 
 * Google Guava Library
 * 
 * @author naveenautomationlabs
 *
 */

public class AverageArray {

	public static void main(String[] args) {

		int num[]= {1,2,3,4,5,3,2,3,4, 5, 6, 9, 10};
		
		double total = 0;
		for(int e : num) {
			total = total + e;
		}
		System.out.println("total: " + total);
		System.out.println("avg is: " + (total/num.length));
		
		//Java 8: Streams:
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
		
		//Google Guava:
		double avg1 = DoubleMath.mean(num);
		System.out.println(avg1);
		
		double s = Stats.meanOf(num);
		System.out.println(s);
		
		List<String> list = Lists.newArrayList("Google", "MS", "Bing", "Yahoo");
		
		String newList[] = list.toArray(new String[list.size()]);
		
		for(String se : newList) {
			System.out.println(se);
		}
		
		
		List<Integer> numL = Lists.newArrayList(23,34,54,32,12);
		Integer[] numList = numL.toArray(new Integer[numL.size()]);

		for(Integer i : numList) {
			System.out.println(i);
		}
		
		int numLs[] = new int[numL.size()];
		for(int x=0; x<numL.size(); x++) {
			numLs[x] = numL.get(x);
		}
		
		for(Integer i : numLs) {
			System.out.println(i);
		}
		
	}

}
