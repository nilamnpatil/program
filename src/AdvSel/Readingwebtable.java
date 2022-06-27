package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingwebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://money.rediff.com/index.html");
        List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
        List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));
        System.out.println(row.size());
        System.out.println(column.size());
        for(int i=0;i<row.size();i++)
        {
        	System.out.println(row.get(i).getText());
        	
        }
	}
	

}
