package Testcase;


import org.testng.annotations.Test;

import ProjectWrappers.projectwrapper;

public class MergeLead extends projectwrapper{

	@Test(groups = "Regression")
	public  void mergeLead() throws Exception {

		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[1]/td[2]/a");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10076");
		clickById("ext-gen114");
		clickByXpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a");
		driver.switchTo().window(winHandleBefore);
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[2]/td[2]/a");
		//String winHandleBefore1 = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10080");
		clickById("ext-gen114");
		clickByXpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a");
		driver.switchTo().window(winHandleBefore);
		clickByLink("Merge");	
		driver.switchTo().alert().accept();
	}

}
