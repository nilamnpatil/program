package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikep\\eclipse-workspace\\Nilam\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
      WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));  
      searchbar.sendKeys("seleniu");
      Thread.sleep(3000);
      List<WebElement> autoSugestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
      for(int i=0;i<autoSugestion.size();i++)
      {
    	 System.out.println(autoSugestion.get(i).getText());
      }
      for(int i =0;i<autoSugestion.size();i++)
      {
    	  String exp ="selenium webdriver";
    	  String actual=autoSugestion.get(i).getText();
    	  if(exp.equals(actual))
    	  {
    		  autoSugestion.get(i).click();
    		  break;
    		  
    		  
    	  }
    	  
      }
      Thread.sleep(5000);
      driver.close();
      }
	}


