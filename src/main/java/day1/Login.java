package day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//URL
		driver.get("http://leaftaps.com/opentaps");
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\prabhu.b\\Desktop\\Screenshot\\screenshot1.png"));
		
		//Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		File src1 =	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("C:\\Users\\prabhu.b\\Desktop\\Screenshot\\screenshot2.png"));
		//Click on CRM button
		String str1= driver.findElement(By.xpath("//*[@id='form']/h2")).getText();
						str1= str1.replaceAll("\n","");
				System.out.println(str1);
		if (str1.contains("WelcomeDemo Sales Manager"))
		System.out.println("Pass");
		else
		System.out.println("Fail");
		
		
		
		driver.findElement(By.xpath("//*[@id='button']/a")).click();
		//Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Inatech_2");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PrabhuB1");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", ""); 
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prab");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Lead Page");
		Select source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Create Lead");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1,00,000");
		Select job = new  Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		job.selectByValue("IND_SOFTWARE");
		Select owner = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		owner.selectByIndex(6);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("007");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Created a new job");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("create lead");
	WebElement code =	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	code.clear();
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("0");
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9047");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	Select ccy = new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
	ccy.selectByValue("INR");
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
	driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("&");
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jack");
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sam");
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Suite 10,moore st");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Tambaram");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	Select country = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
	country.selectByValue("IND");
	Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
	state.selectByValue("IN-TN");
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600073");
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("777");
	Select mar = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
	mar.selectByValue("9002");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("97866875885");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tt@gmail.com");
			
		driver.findElement(By.className("smallSubmit")).click();
		
			
		String str = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(str);
		
		if (str.contains("PrabhuB1"))
		
			System.out.println("Name Matches");
		else
			System.out.println("Name Not Matches");
					
		driver.close();
		
		
		
	}

}
