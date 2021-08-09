package StringQuestions;

import java.util.Arrays;

public class TimePass {

	public static void main(String[] args) {

		
		String name = "i love java"; //Java Love I
		
		String oldName[] = name.split(" ");
		for(int p = 0; p<oldName.length; p++) {
			
			String firstLetter = oldName[p].substring(0, 1);
		    String remainingLetters = name.substring(1, oldName[p].length());
		    firstLetter = firstLetter.toUpperCase();
		    
		    name = firstLetter + remainingLetters;
		    System.out.println("Name: " + name);
			
			
		}
		
	    
	    String nameArr[] = name.split(" ");
	    for(int i=nameArr.length-1; i>=0; i--) {
	    	System.out.print(nameArr[i]+" ");
	    }

	    
	
	}

}
