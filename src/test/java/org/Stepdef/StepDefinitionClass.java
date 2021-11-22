package org.Stepdef;

import java.awt.AWTException;

import org.base.LibGlobal;
import org.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass extends LibGlobal{
	@Given("User is on Cloud Banking login page")
	public void userIsOnCloudBankingLoginPage() {
		browerLaunch("chrome");
		loadUrl("https://salesdemo.habiletechnologies.com/#/createclient");
		implict(20);
		
	}

	@When("User should enter {string} and {string}")
	public void userShouldEnterAnd(String userName, String password) throws AWTException, InterruptedException {
	    
		LoginPage l=new LoginPage();
		l.logIn(userName, password);
	}

	@When("User should click the login button")
	public void userShouldClickTheLoginButton() {
		LoginPage l=new LoginPage();
		l.signClick();
	}

	@Then("User should verify {string} is displayed")
	public void userShouldVerifyIsDisplayed(String expected) {
		LoginPage l=new LoginPage();
		l.userVerification(expected);
		closeBrowser();
		
	}

}
