package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouceOver {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/b?node=6967393031");
driver.manage().window().maximize();   
     WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
    Actions   a=new Actions(driver);
    a.moveToElement(prime).build().perform();
    Thread.sleep(2000);
    WebElement joinprime = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
    //Thread.sleep(2000);
    joinprime.click();
	}
}
