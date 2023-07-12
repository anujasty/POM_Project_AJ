package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	public void validateElement(String actualText, String expectedText, String errorMsg) {
		Assert.assertEquals(actualText, expectedText, errorMsg);
	}
	
	//public void waitForElement(WebDriver driver, int waitTime, By ElementToBeLocated) {
		
	//	WebDriverWait wait = new WebDriverWait(driver, 6);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(addCustomerHeaderField));
		
	//}

	public void selectFromDropDown(WebElement element, String visibleText) {

		Select sel1 = new Select(element);
		sel1.selectByVisibleText (visibleText);
		
	}
	
	public int randomNumGenerator(int bound) {
		
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(bound);
		return generatedNum;
		
	}
}
