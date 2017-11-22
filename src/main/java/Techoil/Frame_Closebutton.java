package Techoil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Closebutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
	
	int finalCount =  driver.findElements(By.tagName("iframe")).size();
    System.out.println(finalCount); 
    
    
    //Enter Main Frame
    driver.switchTo().frame("childIframe");
    driver.findElement(By.xpath("/html/body/div[2]/p/button")).click();
    
    driver.findElement(By.xpath("/html/body/div[3]/p/button")).click();
    driver.switchTo().defaultContent();
    
    driver.findElement(By.xpath("/html/body/div[1]/p[1]/button")).click();
    driver.findElement(By.xpath("/html/body/div[2]/p/button")).click();
    
   // System.out.println(Leftframe); 
   // driver.switchTo().defaultContent();
    

	}

}
