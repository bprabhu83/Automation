package Testcase;
import wrapper.*;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ProjectWrappers.projectwrapper;

public class DuplicateLead extends projectwrapper {

	@Test(groups = "Sanity" )
	
	public void duplicate() throws Exception
	{
		// TODO Auto-generated method stub



		//Click Leads link
		clickByLink("Leads");

		//Click Find leads
		clickByLink("Find Leads");

		// Click on Email tab
		clickByXpath("//div[@class='x-tab-strip-wrap']/ul/li[3]/a[2]/em/span/span");

		//Enter Email
		enterById("ext-gen282","prab3.83@gmail.com");

		//Click Fnd Leads button
		clickById("ext-gen334");

		//Wait 3 sec to load
		Thread.sleep(3000);

		// Click the first search result
		clickByXpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a");

		// Click Duplicate button
		clickByLink("Duplicate Lead");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", ""); 

		//Verify the title as "Duplicate Lead"
		verifyTextById("sectionHeaderTitle_leads","Duplicate Lead");

		//Click create Lead button
		clickByXpath("//div[@class='fieldgroup-body']/table/tbody/tr[24]/td[2]/input");

		// Get the text to compare
		//String dupname = driver.findElement(By.xpath("//div[@class='fieldgroup-body']/table/tbody/tr[2]/td[2]/input")).getText();
		//System.out.println(dupname);

		verifyTextById("viewLead_firstName_sp","prabhu008");

		



	}

}
