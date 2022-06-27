package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikep\\eclipse-workspace\\Nilam\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println("total link size="+links.size());
        for(int i=0;i<links.size();i++)
        {
        	System.out.println(links.get(i).getText());
        	
        }
        for(int i=0;i<links.size();i++)
        {
        	String expected="Gmail";
        	String actual=links.get(i).getText();
        	if(expected.equals(actual))
        	{
        		links.get(i).click();
        		break;
        	}
        	System.out.println("TITLE="+driver.getTitle());
        	Thread.sleep(2000);
        	driver.close();
        }
	}

}
