package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	/**
	 * File Handling - 1:
	 * Copy a File (pdf) and create a different file in the same location
	 * @param arg
	 */

	public static void main(String arg[]) {
		copyFile();
	}
	
	public static void copyFile() {
		File file = new File("/Users/naveenautomationlabs/Downloads/sample.pdf");
		File opFile = new File("/Users/naveenautomationlabs/Downloads/sample-copy.pdf");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i = 0;
		try {
			while((i = fileInputStream.read())!=-1) {
				fileOutputStream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			//close the streams:
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	
	}
	
	
	
	

}
