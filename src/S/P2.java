package S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikep\\eclipse-workspace\\Aarush\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	   WebElement usernametextbox = driver.findElement(By.xpath("//input[@type='text']"));
	   usernametextbox.sendKeys("standard_user");
	WebElement Passwordtextbox = driver.findElement(By.xpath("//input[@id='password']"));
	Passwordtextbox.sendKeys("secret_sauce");
	WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
	      WebElement listbox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
         
		Select L =new Select(listbox);
		L.selectByVisibleText("Price (low to high)");
		WebElement firstaddtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		firstaddtocart.click();
		WebElement cartbutton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartbutton.click();
		    WebElement removebutton = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']"));
		    removebutton.click();
		    WebElement continueshoppingbutton = driver.findElement(By.xpath("//button[@id='continue-shopping']"));
		    continueshoppingbutton.click();
		    WebElement listbox2 = driver.findElement(By.xpath("\"//select[@class='product_sort_container']\""));
		    Select L2 =new Select(listbox2);
		    L2.selectByVisibleText("Price (low to high)");
		   // driver.findElement()
		
		


	}

}
