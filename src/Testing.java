import java.io.File;
import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
//		System.setProperty("webdriver.chrome.verboseLogging", "true");
//
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
		
		String drName = "/Users/naveenautomationlabs/Downloads";
		
		File dir = new File(drName);
		File f[] = dir.listFiles();
		Arrays.sort(f);
		
		for(File e : f) {
			if(e.isFile()) {
				System.out.println("File: " + e.getName() + " " + e.getPath());
			}
			else if(e.isDirectory()) {
				System.out.println("Dir: " + e.getName());
			}
			else {
				System.out.println("unknown: " + e.getName());
			}
		}
		
		
		
		
	}

}
