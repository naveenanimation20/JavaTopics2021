package sample;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		int num[] = {1,2,4,6,7,8}; //8,1,7,2,6,4
		int result[] = new int[num.length];
		
		int j = num.length-1;
		for(int i=0; i<j/2;) {
			result[i] = num[j];
			j--;
			i=i+1;
			result[i] = num[i];

		}
		
		System.out.println(Arrays.toString(result));
		
		
		
	}

}
