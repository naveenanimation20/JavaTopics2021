package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Create a File in Java using: 1. File 2. FileOutStream 3. Java NIO utils
 * 
 * @author naveenautomationlabs
 *
 */

public class CreateFile {

	public static void main(String[] args) {

		// windows: c:\\users\\naveen\\FileHAndle\\sample.text
		String path = "/Users/naveenautomationlabs/Downloads/FileHandle/sample.text";

		// 1. using File:
		File file = new File(path);

		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("file is created");
			} else {
				System.out.println("file is already present....");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 2. FileOutputStream along with Scanner:
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name with location path: ");
			String fileName = sc.nextLine();

			FileOutputStream fos = new FileOutputStream(fileName, true);

			System.out.println("Enter the file content: ");
			String content = sc.nextLine();
			byte b[] = content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File is saved on the given location path");

		} catch (Exception e) {
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
		
		System.out.println("------------------");
		
		//3. Java nio package:
		try {
		Path pathLocation = 
					Paths.get("/Users/naveenautomationlabs/Downloads/FileHandle/newfile.text");
		Path newPath = Files.createFile(pathLocation);
		System.out.println("new file created at : " + newPath);
		}
		catch (Exception e) {
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
	}

}
