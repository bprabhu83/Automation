package classSubclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Subclass extends Superclass {
	
	@BeforeSuite()
	public void Subclass_beforesuite()
	{
		System.out.println("Subclass_beforesuite");
	}
	@BeforeTest()
	public void Subclass_beforeTest()
	{
		System.out.println("SubClass_beforeTest");
	}
	@BeforeClass()
	public void Subclass_beforeClass()
	{
		System.out.println("SubClass_beforeClass");
	}
	@BeforeMethod()
	public void Subclass_beforeMethod()
	{
		System.out.println("SubClass_beforeMethod");
	}
	@Test()
	public void Subclass_Test()
	{
		System.out.println("SubClass_Test");
	}
	@AfterMethod()
	public void SubClass_afterMethod()
	{
		System.out.println("SubClass_afterMethod");
	}
	@AfterClass()
	public void Subclass_afterClass()
	{
		System.out.println("SubClass_afterClass");
	}
	@AfterTest()
	public void SubClass_afterTest()
	{
		System.out.println("SubClass_afterTest");
	}
	@AfterSuite()
	public void SubClass_afterSuite()
	{
		System.out.println("SubClassafterSuite");
	}
	
	

}
