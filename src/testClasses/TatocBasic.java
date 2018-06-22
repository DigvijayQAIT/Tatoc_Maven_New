package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actionClasses.HomePageActions;

public class TatocBasic {
	
	WebDriver driver;
	HomePageActions homePage;
	
	@BeforeClass
	public void initVars() {
		driver = new ChromeDriver();
		homePage = new HomePageActions(driver);
	}
	
	@Test
	public void Step01_Launch_Homepage() {
		homePage.launchHomepage("http://10.0.1.86/tatoc");
		homePage.verifyHomePageLaunched();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
