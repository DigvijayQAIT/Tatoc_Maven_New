package actionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageActions {
	
	WebDriver driver;

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void launchHomepage(String string) {
		driver.get(string);
		System.out.println("User Launched URL: " + string);
	}

	public void verifyHomePageLaunched() {
		WebElement logo = 
		
	}
}
