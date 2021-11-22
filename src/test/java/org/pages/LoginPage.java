package org.pages;

import java.awt.AWTException;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(id="login-button")
	private WebElement signInBtn;
	
	@FindBy(xpath="(//div[contains(text(),'your credentials are not valid')])[1]")
	private WebElement invalidText;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getInvalidText() {
		return invalidText;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	public void logIn(String userName,String password) throws AWTException, InterruptedException {
		Thread.sleep(5000);
		escape();
		sendKeys(userName, getUserName());
		sendKeys(password, getPass());
	}
	public void signClick() {
		click(getSignInBtn());
	}
	public void userVerification(String expected) {
		String actual = getText(getInvalidText());
		verification(expected, actual);
	}
	

}
