package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertP2 {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikep\\eclipse-workspace\\Nilam\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://demo.automationtesting.in/Alerts.html");
      WebElement alertbtn1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
      alertbtn1.click();
      Alert pop=driver.switchTo().alert();
      Thread.sleep(2000);
      String altpop1=pop.getText();
      System.out.println(altpop1);
      pop.accept();
      Thread.sleep(2000);
      
	}

}
