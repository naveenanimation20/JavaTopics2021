package ArrayQuestions;

import java.util.Arrays;

public class MissingElement {

	/**
	 * Find out the missing element in an integer array
	 * 
	 */
	
	public static void main(String[] args) {

		// 1 2 3  5 6 .....100
				
		int num[] = {3,1,2,4,5,6,7,10,8};
		
		int n2 = (num.length+1) * (num.length +2)/2 - Arrays.stream(num).sum();
		System.out.println(n2);
		
		int n1 = findMissingNumber(num, 10);
		System.out.println(n1);
	}
	
	public static int findMissingNumber(int num[], int totalCount) {
		
		int expSum = totalCount * (totalCount+1)/2;
		int actualSum = 0;
		
		for(int i : num) {
			actualSum +=i;
		}
		
		return expSum-actualSum;
		
	}
	

}
