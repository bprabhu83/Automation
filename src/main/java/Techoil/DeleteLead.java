package Techoil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			//USername
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//Password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//Submit
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//Click crm/sfa link
			driver.findElement(By.xpath("//*[@id='button']/a")).click();
			//Click Leads link
			driver.findElement(By.linkText("Leads")).click();
			//Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();
			//driver.findElement(By.xpath("//div[@id='center-content-column']/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/form/div/div[1]/div/ul/li[2]/a[2]/em/span/span")).click();
			
			// Click on Phone tab
			driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']/ul/li[2]/a[2]/em/span/span")).click();
			
			//Clear the existing value in country code
			WebElement code =	driver.findElement(By.id("ext-gen262"));
			code.clear();
			
			//Country code
			driver.findElement(By.id("ext-gen262")).sendKeys("1");
			
			//Area code
			driver.findElement(By.id("ext-gen266")).sendKeys("044");
			
			//phone number
			driver.findElement(By.id("ext-gen270")).sendKeys("9840080327");
			
			//Click find Leads button
			driver.findElement(By.id("ext-gen334")).click();
			
			//Wait to load the search list
			Thread.sleep(3000);
			
			//To get the Lead id
			String a = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).getText();
			System.out.println(a);
			
			//To click on Lead id of first search result
			driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).click();
			
			//Click Delete button
			driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
			
			//Click find Leads button
			driver.findElement(By.linkText("Find Leads")).click();
			
			//Enter deleted Lead Id
			driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen246']/input")).sendKeys(a);
			
			// Click on Find leads button
			driver.findElement(By.id("ext-gen334")).click();
			
			//Taking screenshot
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\prabhu.b\\Desktop\\Screenshot\\screenshotSearchDeletedid.png"));
			
			//Get the Error message
			String err = driver.findElement(By.className("x-paging-info")).getText();
			System.out.println(err);
			//Verify the error message
			if(err.contains("No records to display"))
				System.out.println("Lead deleted");
			else
				System.out.println("Lead not deleted");
			driver.close();
			
			
			
					
	
			


	}

}
