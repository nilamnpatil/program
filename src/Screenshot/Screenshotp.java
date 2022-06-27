package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotp {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikep\\eclipse-workspace\\Nilam\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
  File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     System.out.println(Source);
     File dest=new File("C:\\Users\\nikep\\eclipse-workspace\\Nilam\\Screenshot//photo.jpg");
	 FileHandler.copy(Source, dest);
	 

	}
	//

}
// nilam velocity.....
//manual 
