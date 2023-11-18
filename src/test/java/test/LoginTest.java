package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
    
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleLogin() {
		
		driver = BrowserFactory.init();
		
		//LoginPage loginPage1 = new LoginPage(driver);//just for explanation
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertpassword("abc123");
		loginPage.clickonsigninbutton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varifyDashboardPage("Dashboard");
		
		BrowserFactory.tearDown();
	}
	
	
	
	
	
}
