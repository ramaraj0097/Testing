package StepDefinition;

import org.junit.Assert;

import baseClass.BaseClasss;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryy.PageFactor;

public class CreateAccount extends PageFactor {
	
	@Given("User login the JC Penny website")
	public void user_login_the_jc_penny_website() throws InterruptedException {
	 Openbrowser();
	 PageFactor pg = new PageFactor();
	 		    
	}
	@Then("User verify the {string} is displayed on the title")
	public void user_verify_the_is_displayed_on_the_title(String string) {
	    String title = driver.getTitle();
	    
	  Assert.assertEquals(title, string);
	   			    
	}
	@When("User mouseover the My account button")
	public void user_mouseover_the_my_account_button() {
		Siginbutton(sigin);
	    
	}
	@When("User click the create account")
	public void user_click_the_create_account() throws InterruptedException {
	    creataccount.click();
	    Thread.sleep(4000);
	}
	@Then("User verify the Create Account text")
	public void user_verify_the_create_account_text() {
		String text = creataccount1.getText();
		Assert.assertEquals(text,"Create Account");
	    
	}
	@When("User enters the {string}, {string}, {string}, {string}, {string}")
	public void user_enters_the(String fist,String last,String phone, String email, String pass) {
	    sendtext(firstname, fist);
	    sendtext(lasttname, last);
	    sendtext(phonenumber, phone);
	    sendtext(emailenter, email);
	    sendtext(password1, pass);
    click(checkbox);   
	    
	}
	@When("User click the Create account button")
	public void user_click_the_create_account_button() {
		click(submit);
	    
	}
	@Then("Verify the Confirm Your Account text")
	public void verify_the_confirm_your_account_text() {
	    
	    
	}	
	
	@Given("User open the JC Penny website")
	public void user_open_the_jc_penny_website() throws InterruptedException {
		Openbrowser();
		Thread.sleep(3000);
	}

	@When("User click the signin button")
	public void user_click_the_signin_button() {
		login.click();
	}

	@When("User enter the email address")
	public void user_enter_the_email_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter the password")
	public void user_enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User verify the account")
	public void user_verify_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
