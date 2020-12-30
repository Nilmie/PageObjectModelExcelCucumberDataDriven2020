package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import MiHCM.HomePage;
import MiHCM.LoginPage;
import Utility.ReadExcel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginData {

		WebDriver driver;

	    LoginPage objLogin;
	    HomePage objHomePage;
	    ReadExcel excel = new ReadExcel();
	
		
		@Given("^I'm in the guru bank login page$")
		public void i_m_in_the_guru_bank_login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			System.setProperty("webdriver.chrome.driver","C:\\seldrv\\chromedriver.exe");
			
		    driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://demo.guru99.com/V4/");
		
		}
		
		@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
		public void i_enter_and(String userName, String password) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 objLogin = new LoginPage(driver);
			 String loginPageTitle = objLogin.getLoginTitle();
			 objLogin.loginToGuru99(userName, password);
		   
		}
		
		@Then("^I should able to navigate to the home page$")
		public void i_should_able_to_navigate_to_the_home_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 objHomePage = new HomePage(driver);
			 //Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("Manger Id : mngr293586"));
			 driver.close();
		}

	   

	
	
}
