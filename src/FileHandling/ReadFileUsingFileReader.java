package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {

		String path = "/Users/naveenautomationlabs/Downloads/FileHandle/naveen.text";
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			System.out.println("File content is:");

			int c = 0;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
