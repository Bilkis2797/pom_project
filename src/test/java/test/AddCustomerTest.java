package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	@Test
	public void validCustomerShouldBeAbleToCreateCustomer() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("demo@techfios.com", "abc123");
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varifyDashboardPage("Dashboard");
		dashboardPage.clickOnCustomer();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContactPage("Add Contact");
		addCustomerPage.insertFullName("Selenium july");
		addCustomerPage.selectCompany("Techfios");
		addCustomerPage.insertEmail("demo@techfios.com");
		addCustomerPage.insertPhone("1234567");	
		addCustomerPage.selectCountry("Albania");
		
		
		
		
		
		
	}
	
	
	
	
}
