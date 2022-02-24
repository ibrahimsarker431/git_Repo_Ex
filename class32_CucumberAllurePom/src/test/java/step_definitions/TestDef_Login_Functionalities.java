package step_definitions;


import static org.junit.Assert.assertEquals;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeLoginPage;
import pages.HomePage;
import pages.LandingPage;
//alt + ctrl + O to import library
public class TestDef_Login_Functionalities extends Base {
	
	LandingPage landingPage=new LandingPage();
	EmployeeLoginPage employeeLoginPage=new EmployeeLoginPage();
	HomePage homePage =new HomePage();
	
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		landingPage.navigateURL(); 
	}

	@When("I click on login Menu")
	public void i_click_on_login_Menu() {
		landingPage.click_Login_Btn(); 
	}

	@Then("verify I am in Employee login Page")
	public void verify_I_am_in_Employee_login_Page() {
		assertEquals("Employee Login", employeeLoginPage.getEmployeeLoginLabel() );
	}

	@Then("I enter login Id")
	public void i_enter_login_Id() {
		employeeLoginPage.enterUserId("testpilot@gmail.com");
	}

	@Then("I enter password")
	public void i_enter_password() {
		employeeLoginPage.enterUserPassword("1234");
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    employeeLoginPage.clickLoginBtn();
	}

	@Then("I will be in HomePage")
	public void i_will_be_in_HomePage() {
	    assertEquals("Welcome Test@", homePage.getWelcomeText());
	}


}
