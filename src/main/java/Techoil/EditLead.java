package Techoil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("Chrome");
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("")
		
		
		
		// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//URL
			driver.get("http://leaftaps.com/opentaps");
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\prabhu.b\\Desktop\\Screenshot\\Edit1.png"));
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//Password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//Submit
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.xpath("//*[@id='button']/a")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			driver.findElement(By.id("ext-gen248")).sendKeys("test");
						
			driver.findElement(By.id("ext-gen334")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='ext-gen473']/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();	
			
			//String to Int
			
			//String Stringleadid = "11195";
			//int numleadid = Integer.parseInt(Stringleadid);
			
			// Int to String
			
			//Integer.toString
			
		
			
			//driver.findElement(By.linkText("10023")).click();
			String s= driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
					if(s.contains("View Lead"))
						System.out.println("Pass");
					else
						System.out.println("Fail");
					driver.findElement(By.linkText("Edit")).click();
				
					WebElement code =	driver.findElement(By.id("updateLeadForm_companyName"));
					code.clear();
					driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Sterling");
					driver.findElement(By.xpath("//form[@id='updateLeadForm']/div/div[2]/table/tbody/tr[12]/td[2]/input")).click();
				
				String comp =	driver.findElement(By.id("viewLead_companyName_sp")).getText();
				if (comp.contains("Sterling"))
					System.out.println("Company name matches");
				else
					System.out.println("Company name not matches");
				File sr=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sr,new File("C:\\Users\\prabhu.b\\Desktop\\Screenshot\\Edit2.png"));
				driver.close();	
			
			
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		
		
			
			
			
	}

	
	
	
}
