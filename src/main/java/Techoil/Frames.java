package Techoil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		int finalCount =  driver.findElements(By.tagName("iframe")).size();
        System.out.println(finalCount); 
        
       /* 
        for(int i=0;i<finalCount;i++)
        {
        	driver.switchTo().frame(i);
        	int a = driver.findElements(By.tagName("iframe")).size();
        	System.out.println(a);
        }*/
        
          
        
        
        
             
        
        //Left Outer frame
       
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
       int Leftframe =  driver.findElements(By.tagName("iframe")).size();
       System.out.println(Leftframe); 
       driver.switchTo().defaultContent();
      
       //Center Outer Frame
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[2]")));
       int centerframe =  driver.findElements(By.tagName("iframe")).size();
       System.out.println(centerframe); 
       driver.switchTo().defaultContent();
       
       
       //Top Outer frame
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[1]")));
       int Topframe =  driver.findElements(By.tagName("iframe")).size();
       System.out.println(Topframe); 
       driver.switchTo().defaultContent();
       
       //Right frame
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[3]")));
       int Rightframe =  driver.findElements(By.tagName("iframe")).size();
       System.out.println(Rightframe);
       driver.switchTo().defaultContent();
       
       //Bottom
              
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/iframe")));
       int Bottomframe =  driver.findElements(By.tagName("iframe")).size();
       System.out.println(Bottomframe);
       driver.switchTo().defaultContent();
       
    
        
       
       
       
       
        
        
		 
		
		
		
		
		

	}

}
