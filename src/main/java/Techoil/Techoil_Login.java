package Techoil;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Techoil_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("http://qc.techoil.com:2050");
		
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys("prabhu.b@inatech.com");
		
		driver.findElement(By.id("cred_password_inputtext")).sendKeys("Password@2");
		
		driver.findElement(By.id("cred_password_inputtext")).submit();
		
		//.findElement(By.xpath("//*[@id='cred_sign_in_button']")).click();
		
		String str = driver.findElement(By.id("DisplayName")).getText();
		
		System.out.println(str);
		
		if(str.contains("Prabhu Balu"))
			
		System.out.println("Pass");
		
		else
			
			System.out.println("Fail");
		
		driver.close();
		
				
		
	}

}
