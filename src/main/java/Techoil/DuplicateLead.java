package Techoil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
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
		
		// Click on Email tab
		driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']/ul/li[3]/a[2]/em/span/span")).click();
		
		//Enter Email
		driver.findElement(By.id("ext-gen282")).sendKeys("prab3.83@gmail.com");
		
		//Click Fnd Leads button
		driver.findElement(By.id("ext-gen334")).click();
		
		//Wait 3 sec to load
		Thread.sleep(3000);
		
		// Click the first search result
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).click();
		
		// Click Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", ""); 
		
		//Verify the title as "Duplicate Lead"
		String dup = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
				if(dup.contains("Duplicate Lead"))
			System.out.println("Correct title displayed");
		else
			System.out.println("Incorrect title displayed");
				
		//Click create Lead button
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']/table/tbody/tr[24]/td[2]/input")).click();
		
		// Get the text to compare
		//String dupname = driver.findElement(By.xpath("//div[@class='fieldgroup-body']/table/tbody/tr[2]/td[2]/input")).getText();
		//System.out.println(dupname);
		
		String dupdis = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(dupdis);
		
		if(dupdis.contains("prabhu008"))
				
				System.out.println("Duplicate Lead name is correct");
		else
			System.out.println("Duplicate LEad name is not correct");
		driver.close();
		
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
