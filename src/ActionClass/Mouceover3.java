package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouceover3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?ef_id=c255a977cf5217df7a19cbe37e488479:G:s&s_kwcid=AL!739!10!75522840390274!75522970275457&semcmpid=sem_F1167BY7_Brand_adcenter");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a=new Actions(driver);
		a.moveToElement(loginbtn).build().perform();
		Thread.sleep(3000);
		WebElement giftcard = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		giftcard.click();
		

	}

}
