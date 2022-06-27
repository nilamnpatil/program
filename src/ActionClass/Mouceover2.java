package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouceover2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b?node=6967393031");
		driver.manage().window().maximize();
		WebElement acclist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a= new Actions(driver);
		a.moveToElement(acclist).build().perform();
		
		WebElement yourwishlist = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		yourwishlist.click();
		

	}

}
