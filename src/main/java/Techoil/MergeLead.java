package Techoil;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
			
		
		//File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\prabhu.b\\Desktop\\Screenshot\\Edit1.png"));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click crm/sfa link
		driver.findElement(By.xpath("//*[@id='button']/a")).click();
		
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Merge leads
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("//*[@class='twoColumnForm']/tbody/tr[1]/td[2]/a")).click();
		
		
	Set<String> id = 	driver.getWindowHandles();
	Iterator<String> it =id.iterator();
	String parentid = it.next();
	String childid = it.next();
	driver.switchTo().window(childid);
	driver.findElement(By.xpath("//div[@class='x-tab-panel-bwrap']/div/div/div/div/div[1]/div/input")).sendKeys("10835");
	driver.findElement(By.xpath("//td[@class='x-panel-btn-td']/table/tbody/tr/td[2]/em/button")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("10835")).click();
	driver.switchTo().window(parentid);
	driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr[2]/td[2]/a")).click();

	
	
	driver.findElement(By.xpath("//div[@class='x-tab-panel-bwrap']/div/div/div/div/div[1]/div")).sendKeys("10863");
	
	
	
	
	
		
		
		
		
		
		

	}

}
