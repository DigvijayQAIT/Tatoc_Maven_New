package actionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GridGatePageActions {

	WebDriver driver;
	
	public GridGatePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void launchGridGatePage(String string) {
		driver.get(string);
		System.out.println("User Launched URL: " + string);
		
	}

	public void verifyGridGatePageLaunched() {
		WebElement header = driver.findElement(By.xpath("//h1[text() = 'Grid Gate']"));
		Assert.assertTrue(header.isDisplayed());
		System.out.println("User is on grid gate page");	
	}

	public void verifyGreenBoxDisplayed() {
		WebElement greenBox = driver.findElement(By.xpath("//div[@class = 'greenbox']"));
		Assert.assertTrue(greenBox.isDisplayed());
		System.out.println("Green Box is displayed");
	}

	public void verifyRedBoxDisplayed() {
		WebElement redBox = driver.findElement(By.xpath("//div[@class = 'redbox']"));
		Assert.assertTrue(redBox.isDisplayed());
		System.out.println("Red Box is displayed");
		
	}

}
