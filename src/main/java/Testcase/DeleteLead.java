package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ProjectWrappers.projectwrapper;
import wrapper.*;

public class DeleteLead extends projectwrapper{
	
	@Test

	public void delete() throws Exception{
		// TODO Auto-generated method stub
		
		
		
			//Click Leads link
		clickByLink("Leads");
			
		
			//Click Find leads
		clickByLink("Find Leads");
			
			// Click on Phone tab
		clickByXpath("//div[@class='x-tab-strip-wrap']/ul/li[2]/a[2]/em/span/span");
						
			//Clear the existing value in country code
			WebElement code =	driver.findElement(By.id("ext-gen262"));
			code.clear();
			
			//Country code
			enterById("ext-gen262","1");
						
			//Area code
			enterById("ext-gen266","044");
						
			//phone number
			enterById("ext-gen270","89");
						
			//Click find Leads button
			clickById("ext-gen334");
						
			//Wait to load the search list
			Thread.sleep(3000);
			
			//To get the Lead id
			String a = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).getText();
			System.out.println(a);
			
			//To click on Lead id of first search result
			clickByXpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a");
						
			//Click Delete button
			clickByXpath("//a[@class='subMenuButtonDangerous']");
						
			//Click find Leads button
			clickByLink("Find Leads");
						
			//Enter deleted Lead Id
			enterByXpath("//div[@id='x-form-el-ext-gen246']/input","a");
						
			// Click on Find leads button
			clickById("ext-gen334");
			driver.findElement(By.id("ext-gen334")).click();
			
			//Taking screenshot
			takeSnap();
			
			//Get the Error message
			verifyTextByClassname("x-paging-info","No records to display");
			
						
	
			


	}

}
