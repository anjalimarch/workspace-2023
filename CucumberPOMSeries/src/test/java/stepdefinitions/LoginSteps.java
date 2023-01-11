package stepdefinitions;

import org.junit.Assert;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
		DriverFactory.getDriver().get("https://mytec.executivecentre.com/login/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    
		String title = loginPage.getLoginPageTitle();
		System.out.println("login page Title--"+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	    
		String title = loginPage.getLoginPageTitle();
		System.out.println("login page Title--"+title);
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	

	@Then("forgot yout password link should be displayed")
	public void forgot_yout_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
		
	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
	    
		loginPage.enterUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	   
	  
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   
		loginPage.clickOnLogin();
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
		loginPage.getLoginPageTitle();
	}

	
}
