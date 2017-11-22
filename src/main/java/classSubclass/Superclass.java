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

public class Superclass {
	
	@BeforeSuite()
	public void Superclass_beforesuite()
	{
		System.out.println("SuperClass_beforesuite");
	}
	@BeforeTest()
	public void Superclass_beforeTest()
	{
		System.out.println("SuperClass_beforeTest");
	}
	@BeforeClass()
	public void Superclass_beforeClass()
	{
		System.out.println("SuperClass_beforeClass");
	}
	@BeforeMethod()
	public void Superclass_beforeMethod()
	{
		System.out.println("SuperClass_beforeMethod");
	}
	@Test()
	public void Superclass_Test()
	{
		System.out.println("SuperClass_Test");
	}
	@AfterMethod()
	public void Superclass_afterMethod()
	{
		System.out.println("SuperClass_afterMethod");
	}
	@AfterClass()
	public void Superclass_afterClass()
	{
		System.out.println("SuperClass_afterClass");
	}
	@AfterTest()
	public void Superclass_afterTest()
	{
		System.out.println("SuperClass_afterTest");
	}
	@AfterSuite()
	public void Superclass_afterSuite()
	{
		System.out.println("SuperClass_afterSuite");
	}
}