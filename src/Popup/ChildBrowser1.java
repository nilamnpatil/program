package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikep\\eclipse-workspace\\Nilam\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
       WebElement windowpopupbtn = driver.findElement(By.xpath("//input[@name='NewWindow']"));
       windowpopupbtn.click();
      Set<String> windows = driver.getWindowHandles();
      Iterator<String> itr = windows.iterator();
      String win[] = new String[10];
      System.out.println("total windows="+windows.size());
      for(int i=0;i<windows.size();i++)
      {
    	  win[i]=itr.next();
    	  System.out.println(win[i]);
    	  
      }
      //driver.quit();
      driver.switchTo().window(win[0]);
      System.out.println("Title of window 0="+driver.getTitle());
      Thread.sleep(2000);
      driver.switchTo().window(win[1]);
      System.out.println("title of window 1="+driver.getTitle());
      driver.manage().window().maximize();
      Thread.sleep(2000);
     WebElement searchbtn = driver.findElement(By.xpath("//input[@id='the7-search']"));
     searchbtn.sendKeys("nilam");
     driver.findElement(By.xpath("//a[@class='submit']")).click();
     
     // driver.close();
      
      
	}

}
