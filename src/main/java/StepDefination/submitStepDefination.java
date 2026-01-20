package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.submitpage;

public class submitStepDefination extends submitpage {
	
	@Given("User should be login page")
	public static void Usershouldbeloginpage()
	{
		browserinitilization(submitpage.Browser, submitpage.URL);
	}
	
	@When("user enters valid username {string}")
	public static void userentersvalidusername(String email)
	{
		Enteruser_input(email, submitpage.userinput);
	}
	
	@And("user enters valid password {string}")
	public static  void userentersvalidpassword(String pass)
	{
		Enterpassword_input(pass, submitpage.passwordinput);
	}
	
	@And("Clicks on submit")
	public  static void Clicksonsubmit()
	{
		Login_click();
	}
}
