package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	/*
	 * Print all files and folders in a directory in sorted order
	 */

	public static void main(String[] args) {

		// c:\\program files\\java
		String path = "/Users/naveenautomationlabs/Downloads";

		File file = new File(path);

		File downloadDir[] = file.listFiles();

		Arrays.sort(downloadDir);

		for (File e : downloadDir) {

			if (e.isFile()) {
				System.out.println("File : " + e.getName() + " " + e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println("Directory: " + e.getName() + " " + e.getAbsolutePath());
			} else {
				System.out.println("Not Known :" + e.getName() + " " + e.getAbsolutePath());
			}

		}

	}

}
