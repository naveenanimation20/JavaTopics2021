package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	/**
	 * Count total chars, words and lines in a given file
	 * 
	 * @param args
	 */

	static String path = "/Users/naveenautomationlabs/Documents/demo.txt";

	public static void main(String[] args) {

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			String currLine = reader.readLine().trim();

			while (currLine != null) {

				lineCount++;

				// words:
				String words[] = currLine.split(" ");
				wordCount = wordCount + words.length;

				// line:
				for (String word : words) {
					charCount = charCount + word.length();
				}
				currLine = reader.readLine();
			}

			System.out.println("total lines: " + lineCount);
			System.out.println("total words: " + wordCount);
			System.out.println("total chars: " + charCount);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
