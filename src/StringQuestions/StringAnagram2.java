package StringQuestions;

public class StringAnagram2 {

	public static boolean isAnagram(String s1, String s2) {
		
		if(s1==null || s2==null) {
			return false;
		}

		String s3 = s1.replaceAll("\\s", "").toLowerCase();
		String s4 = s2.replaceAll("\\s", "").toLowerCase();

		boolean flag = true;
			
		if(s3.length()==1 && s4.length()==1 ) {
			if(s3.equals(s4)) {
				return true;
			}
			else {
				return false;
			}
		}

		if (s3.length() != s4.length()) {
			return false;
		}

		else {
			char c1[] = s3.toCharArray();
			StringBuilder sb = new StringBuilder(s4);

			for (char c : c1) {
				int index = sb.indexOf("" + c);
				if (index != -1) {
					sb.deleteCharAt(index);
				} else {
					flag = false;
					break;
				}
			}

		}
		
		return flag;

	}

	public static void main(String[] args) {
//
		System.out.println(isAnagram("TAA", "ATT"));
		System.out.println(isAnagram("ACT", "CATT"));
		System.out.println(isAnagram("ACT", "cat"));

		System.out.println(isAnagram("Listen", "Silent"));
		System.out.println(isAnagram("Listen", "Silen t"));
		System.out.println(isAnagram("Lives", "ELVIS"));
		System.out.println(isAnagram("CAT", "act"));
		System.out.println(isAnagram("Toss", "shot") +"....");
		System.out.println(isAnagram("joy", "enjoy")+"...");
		System.out.println(isAnagram("Listen", "Silent "));
		System.out.println(isAnagram("Li    ste   n", "Si   l     e    nt "));
		System.out.println(isAnagram("T", "T"));
		System.out.println(isAnagram(null, "T"));
		System.out.println(isAnagram(null, null));



	}

}
