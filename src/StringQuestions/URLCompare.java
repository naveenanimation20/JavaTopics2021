package StringQuestions;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

	/**
	 * 
	 * What will be the output when you compare site URL with its ip address?
	 */

	public static void main(String[] args) {

		//abc.com --> 89.90.98.101
		
		try {
		
			System.out.println(new URL("https://naveenautomationlabs.com")
						.equals(new URL("https://45.130.228.5")));
		
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		String dob = "01-01-1990";
		//System.out.println(dob.replace("-","/")); 
		System.out.println(dob.replace("-","\\"));
				
		int j = 0;
		for(int i=0; i<100; i++) {
			j = j++;
			System.out.println(j);
		}
		
	}

}
