package Techoil;
import wrapper.*;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_VerifyMsg extends GenericWrappersInaTech{
	
	@Test

	public void irct()
	{

System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		
		verifyTitle();
		
		/*System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Sign up")).click();
		String str1= driver.findElement(By.xpath("//*[@id='userRegistrationForm']/div[2]/p")).getText();
		System.out.println(str1);*/
		
	}

	private void verifyTitle() {
		// TODO Auto-generated method stub
		
	}

}
