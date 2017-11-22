package Testcase;

import wrapper.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login extends GenericWrappersInaTech {


	@Test

	public void createlead() throws Exception
	{

		invokeApp("chrome", "http://leaftaps.com/opentaps");

		enterById("username", "Demosalesmanager");
		enterById("password","crmsfa");




		clickByClassName("decorativeSubmit");
		//driver.findElement(By.className("decorativeSubmit")).click();

		takeSnap();		
		/*File src1 =	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("C:\\Users\\prabhu.b\\Desktop\\Screenshot\\screenshot2.png"));
		 */		

		//Click on CRM button
		verifyTextByXpath("//*[@id='form']/h2","Demo Sales Manager");
		/*String str1= driver.findElement(By.xpath("//*[@id='form']/h2")).getText();
						str1= str1.replaceAll("\n","");
				System.out.println(str1);
		if (str1.contains("WelcomeDemo Sales Manager"))
		System.out.println("Pass");
		else
		System.out.println("Fail");*/


		clickByXpath("//*[@id='button']/a");
		//driver.findElement(By.xpath("//*[@id='button']/a")).click();

		//Create Lead Link
		clickByLink("Create Lead");
		//driver.findElement(By.linkText("Create Lead")).click();

		enterById("createLeadForm_companyName","Inatech_2");
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Inatech_2");


		enterById("createLeadForm_firstName","PrabhuB1");
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PrabhuB1");

		enterById("createLeadForm_lastName","B");
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");


		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", ""); 


		enterById("createLeadForm_firstNameLocal","Prab");
		//driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prab");

		enterById("createLeadForm_lastNameLocal","B");
		//driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("B");

		enterById("createLeadForm_personalTitle","Lead Page");
		//driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Lead Page");

		Select source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");

		enterById("createLeadForm_generalProfTitle","Create Lead");
		//driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Create Lead");

		enterById("createLeadForm_annualRevenue","1,00,000");
		//driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1,00,000");


		Select job = new  Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		job.selectByValue("IND_SOFTWARE");

		Select owner = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		owner.selectByIndex(6);


		enterById("createLeadForm_sicCode","007");
		//driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("007");

		enterById("createLeadForm_description","Created a new job");
		//driver.findElement(By.id("createLeadForm_description")).sendKeys("Created a new job");

		enterById("createLeadForm_importantNote","create lead");
		//driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("create lead");


		WebElement code =	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		code.clear();

		enterById("createLeadForm_primaryPhoneCountryCode","0");
		//driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("0");

		enterById("createLeadForm_primaryPhoneAreaCode","044");
		//driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");

		enterById("createLeadForm_primaryPhoneExtension","9047");
		//driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9047");

		enterById("createLeadForm_departmentName","Testing");
		//driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		Select ccy = new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
		ccy.selectByValue("INR");

		enterById("createLeadForm_numberEmployees","200");
		//driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");

		enterById("createLeadForm_tickerSymbol","&");
		//driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("&");

		enterById("createLeadForm_primaryPhoneAskForName","Jack");
		//driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jack");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");

		enterById("createLeadForm_generalToName","Sam");
		//driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sam");

		enterById("createLeadForm_generalAddress1","Suite 10,moore st");
		//driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Suite 10,moore st");

		enterById("createLeadForm_generalAddress2","Tambaram");
		//driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Tambaram");

		enterById("createLeadForm_generalCity","Chennai");
		//driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");


		Select country = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		country.selectByValue("IND");

		Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByValue("IN-TN");

		enterById("createLeadForm_generalPostalCode","600073");
		//driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600073");

		enterById("createLeadForm_generalPostalCodeExt","777");
		//driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("777");

		Select mar = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		mar.selectByValue("9002");

		enterById("createLeadForm_primaryPhoneNumber","97866875885");
		//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("97866875885");

		enterById("createLeadForm_primaryEmail","tt@gmail.com");
		//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tt@gmail.com");


		clickByClassName("smallSubmit");			
		//driver.findElement(By.className("smallSubmit")).click();


		verifyTextById("viewLead_firstName_sp","PrabhuB1");
		/*String str = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		System.out.println(str);

		if (str.contains("PrabhuB1"))

			System.out.println("Name Matches");
		else
			System.out.println("Name Not Matches");*/

		driver.close();



	}

}
