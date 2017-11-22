package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ProjectWrappers.projectwrapper;
public class CreateLead extends projectwrapper {

	//@Test(invocationCount = 2, threadPoolSize=2,invocationTimeOut=3000)
	
	@BeforeClass()
	public void setFilename()
	{
		excel = "Login";
		
	}

	@Test(dataProvider ="fechdata")
	public  void createLead(String companyname,String firstname,String Lastname) throws Exception 
	{
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", companyname);
		enterById("createLeadForm_firstName", firstname);
		enterById("createLeadForm_lastName", Lastname);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		clickByClassName("smallSubmit");


			
	}



}
