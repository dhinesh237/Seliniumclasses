package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.PojoClass;
import cucumber.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook extends BaseClass {
	PojoClass p ;
	@Given("to launch the chrome browser and max the window")
	public void to_launch_the_chrome_browser_and_max_the_window() {
		browserlaunch();
		Windowmaximize();
	    }

	@When("To launch url of fb app")
	public void to_launch_url_of_fb_app() {
		launchUrl("https://en-gb.facebook.com/");
	    }

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		p = new PojoClass();
		passText("abcd@gmail.com",p.getEmailbox() );
	    }

	@When("To pass invalid passwrd in password field")
	public void to_pass_invalid_passwrd_in_password_field() {
		p = new PojoClass();
		passText("1234567",p.getPasswrdbox());
	    
	    }

	@When("To click the login button")
	public void to_click_the_login_button() {
		clickBtn(p.getLoginbtn());
	    }

	@When("To check whether it navigate to the homepage or not")
	public void to_check_whether_it_navigate_to_the_homepage_or_not() {
		System.out.println("login credentials");
	    }

	@Then("To close browser")
	public void to_close_browser() {
		closeEntireBrowser();
	    }

	@When("User has to hit the fb url")
	public void user_has_to_hit_the_fb_url() {
		launchUrl("https://en-gb.facebook.com/");
	    }

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String email) {
		p = new PojoClass();
		passText(email,p.getEmailbox());
		
	    }

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		p = new PojoClass();
		passText(pass,p.getPasswrdbox());
		
	    }

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		clickBtn(p.getLoginbtn());
	    }

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	    }

}
