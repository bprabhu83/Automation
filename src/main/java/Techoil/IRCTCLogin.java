package Techoil;


import java.io.File;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class IRCTCLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("prabhu123");
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("Prabhubalu123");
		Select 	drop = new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));
		drop.selectByValue("6");
		driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("Swift");
		Select drop1 = new Select(driver.findElement(By.id("userRegistrationForm:prelan")));
		drop1.selectByIndex(0);
		driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("Prabhu");
		driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("Prabhu");
		driver.findElement(By.id("userRegistrationForm:gender:0")).click();
		driver.findElement(By.id("userRegistrationForm:maritalStatus:0")).click();
		Select day = new Select(driver.findElement(By.id("userRegistrationForm:dobDay")));
		day.selectByValue("03");
		Select month = new Select(driver.findElement(By.id("userRegistrationForm:dobMonth")));
		month.selectByIndex(10);
		Select year = new Select(driver.findElement(By.id("userRegistrationForm:dateOfBirth")));
		year.selectByValue("1983");
		Select occ = new Select(driver.findElement(By.id("userRegistrationForm:occupation")));
		occ.selectByVisibleText("Professional");
		Select country = new Select(driver.findElement(By.id("userRegistrationForm:countries")));
		country.selectByValue("94");
		driver.findElement(By.id("userRegistrationForm:email")).sendKeys("prab3.83@gmail.com");
				driver.findElement(By.id("userRegistrationForm:mobile")).sendKeys("9840080327");
		Select Nationality = new Select(driver.findElement(By.id("userRegistrationForm:nationalityId")));
		Nationality.selectByValue("94");
		driver.findElement(By.id("userRegistrationForm:address")).sendKeys("Chennai");
		driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("600073");
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.id("userRegistrationForm:statesName")).click();
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", ""); 
		WebElement element = driver.findElement(By.id("userRegistrationForm:pincode"));
		element.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		//driver.findElement(By.name("userRegistrationForm:cityName")).click();
		Select city = new Select(driver.findElement(By.name("userRegistrationForm:cityName")));
		
		city.selectByValue("Kanchipuram");
		Thread.sleep(3000);
		Select Post = new Select(driver.findElement(By.id("userRegistrationForm:postofficeName")));
		Post.selectByIndex(1);
		driver.findElement(By.id("userRegistrationForm:landline")).sendKeys("9840080327");
		
		
		
		
	}
}