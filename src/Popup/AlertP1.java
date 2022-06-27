package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertP1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikep\\eclipse-workspace\\Nilam\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement signinbuton=driver.findElement(By.xpath("//input[@name='proceed']"));
		signinbuton.click();
		Thread.sleep(2000);
		Alert pop=driver.switchTo().alert();
		String value= pop.getText();
		System.out.println("Popup Text ="+value);
		pop.accept();
		Thread.sleep(3000);
		driver.close();
	}

}
