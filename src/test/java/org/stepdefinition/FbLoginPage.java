package org.stepdefinition;

import io.cucumber.datatable.*;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.base.BaseClass;
import org.pojo.PojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLoginPage extends BaseClass {
	PojoClass p;

	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		browserlaunch();
		Windowmaximize();
	}

	@When("To launch the url of fb app")
	public void to_launch_the_url_of_fb_app() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() throws InterruptedException {
		p = new PojoClass();
		Thread.sleep(3000);
		clickBtn(p.getCreateNewAc());

	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		p = new PojoClass(); 
		passText(l.get(1), p.getFirstNameTxtBox());

	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {

		p = new PojoClass();
		passText("sdfghjk", p.getSecondNameTxtBox());
		
	}
	@When("To pass phno or email in email text box")
	public void to_pass_phno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		p = new PojoClass();
		passText(l.get(1).get(1),p.getPhnorEmailTxtBox());

	}
	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		p = new PojoClass();
		passText("abcd@gmail.com", p.getPhnorEmailTxtBox());

	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		closeEntireBrowser();

	}

}
