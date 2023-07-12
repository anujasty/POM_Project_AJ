package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	//TestData
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = "Dashboard";
	@Test
	public void validUserShouldBeAbleToLogin() {
			
		driver = BrowserFactory.init();		
				
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSignin();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);	
		dashboardPage.validateDashboardPage(dashboardValidationText);
		
		BrowserFactory.teardown();
	}
}