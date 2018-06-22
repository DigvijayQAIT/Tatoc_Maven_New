package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actionClasses.GridGatePageActions;
import actionClasses.HomePageActions;

public class TatocBasic {
	
	WebDriver driver;
	HomePageActions homePage;
	GridGatePageActions gridGatePage;
	
	@BeforeClass
	public void initVars() {
		driver = new ChromeDriver();
		homePage = new HomePageActions(driver);
		gridGatePage = new GridGatePageActions(driver);
	}
	
	@Test
	public void Step01_Launch_HomePage() {
		homePage.launchHomePage("http://10.0.1.86/tatoc");
		homePage.verifyHomePageLaunched();
		homePage.verifyLinksDisplayed();
//		homePage.verifyBasicCourseLinkClicked();
	}
	
	@Test(dependsOnMethods = {"Step01_Launch_HomePage"})
	public void Step02_Launch_GridGatePage() {
		gridGatePage.launchGridGatePage("http://10.0.1.86/tatoc/basic/grid/gate");
		gridGatePage.verifyGridGatePageLaunched();
		gridGatePage.verifyGreenBoxDisplayed();
		gridGatePage.verifyRedBoxDisplayed();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
