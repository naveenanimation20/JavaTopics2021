package FileHandling;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String a[]) {
		String path = "/Users/naveenautomationlabs/Downloads/FileHandle/naveen.text";

		try {

			File file = new File(path);

			if (!Desktop.isDesktopSupported()) {
				System.out.println("desktop not supported");
				return;
			}

			Desktop desktop = Desktop.getDesktop();

			if (file.exists()) {
				desktop.open(file);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		String str = "Hi Welcome India";
		
		String s[] = str.split(" ");
		int mid = s.length/2;
		
		for(int i=0; i<s.length; i++) {
			if(s[i].length() % 2 ==0) {
				System.out.println("Even Length String : " + s[i] + ", Middle:" + s[mid]);
			}
			else {
				System.out.println("Odd Length String : " + s[i] + ", Middle:" + s[mid]);
			}
		}
		

	}
}
