package Techoil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Ram", Keys.ENTER);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 allLinks.size();
				
		for (WebElement eachLink : allLinks) 
		{
		
			System.out.println(eachLink.getText());
			//System.out.println(eachLink.getAttribute("href"));
		//	System.out.println(eachLink.getAttribute("onmousedown"));
			
		
		}
		
		
		

	}

}
