package actionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageActions {
	
	WebDriver driver;

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void launchHomePage(String string) {
		driver.get(string);
		System.out.println("User Launched URL: " + string);
	}

	public void verifyHomePageLaunched() {
		WebElement logo = driver.findElement(By.className("title"));
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("User is on homepage");
	}

	public void verifyLinksDisplayed() {
		WebElement basicCourseLink = driver.findElement(By.xpath("//a[text()='Basic Course']"));
		Assert.assertTrue(basicCourseLink.isDisplayed());
		WebElement advanceCourseLink = driver.findElement(By.xpath("//a[text()='Advanced Course']"));
		Assert.assertTrue(advanceCourseLink.isDisplayed());
		System.out.println("Page Links are displayed");
	}

	public void verifyBasicCourseLinkClicked() {
		WebElement basicCourseLink = driver.findElement(By.xpath("//a[text()='Basic Course']"));
		basicCourseLink.click();
		System.out.println("Basic Course link clicked");
		
	}
}
