package ProjectWrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Techoil.ExcelRead;
import wrapper.GenericWrappersInaTech;

public class projectwrapper extends GenericWrappersInaTech {
	
	public static String excel;
	
	@Parameters({"browser","url","user","Pwd"})
	@BeforeMethod(groups = {"Smoke","Sanity"})
		public void login(String browser,String url,String user,String Pwd) throws Exception {
		invokeApp(browser,url);
		enterById("username", user);
		enterById("password", Pwd);
		clickByClassName("decorativeSubmit");
		clickByXpath("//*[@id='button']/a/img");
	}
	
	/*@AfterMethod(groups = {"Smoke","Sanity"})
	public void closeApp(){
		driver.close();
	}*/
	
	@DataProvider(name = "fechdata")
	public Object[][] getdata() throws InvalidFormatException, IOException
	{
		ExcelRead data = new ExcelRead();
		return data.excelRead(excel);
		
		
	}

}
