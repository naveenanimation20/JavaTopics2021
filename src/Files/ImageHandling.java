package Files;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) {

		// .jpg ---> .png/.bmp/.gif

		try {
//			URL url = new URL(
//					"https://images-eu.ssl-images-amazon.com/images/G/31/img21/CEPC/Clearance/May21/V238940049_IN_PC_BAU_Edit_Creation_Laptops2X._SY608_CB667377204_.jpg");
//			
			File file = new File("/Users/naveenautomationlabs/Downloads/test.jpg");
			
			BufferedImage image = ImageIO.read(file);

			ImageIO.write(image, "jpg", new File("./images/ref.jpg"));
			ImageIO.write(image, "gif", new File("./images/ref.gif"));
			ImageIO.write(image, "png", new File("./images/ref.png"));
			ImageIO.write(image, "bmp", new File("./images/ref.bmp"));
			ImageIO.write(image, "pdf", new File("./images/ref.pdf"));


			System.out.println("DONE.....");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
