package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ProjectWrappers.projectwrapper;

public class EditLead extends projectwrapper{


	@Test(groups = "Regression")

	public void Edit() throws Exception
	{
			
		clickByLink("Create Lead");
		
		clickByLink("Find Leads");			
		
		enterById("ext-gen248","test");
		
		clickById("ext-gen334");						
		
		Thread.sleep(3000);
		clickByXpath("//*[@id='ext-gen473']/div[1]/table/tbody/tr[1]/td[1]/div/a");
		
		verifyTextById("sectionHeaderTitle_leads","View Lead");
		
		clickByLink("Edit");
		
		WebElement code =	driver.findElement(By.id("updateLeadForm_companyName"));
		code.clear();

		enterById("updateLeadForm_companyName","Sterling");
		
		clickByXpath("//form[@id='updateLeadForm']/div/div[2]/table/tbody/tr[12]/td[2]/input");
		
		verifyTextById("viewLead_companyName_sp","Sterling");
		
				//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("")));






	}




}
