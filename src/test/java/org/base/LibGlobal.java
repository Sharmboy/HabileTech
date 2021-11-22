package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LibGlobal {
	public static WebDriver driver;

	public WebDriver browerLaunch(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Browser launch not responding");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public void implict(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.close();

	}

	public WebElement findElementById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;

	}

	public WebElement findElementByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}

	public void click(WebElement element) {
		element.click();
	}
	
	public void sendKeys(String text,WebElement element) {
		element.sendKeys(text);
	}
	
	public void verification(String expected, String actual) {
		Assert.assertEquals("Msg Verification",expected, actual);
	}
	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public void promptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void escape() throws AWTException {
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_ESCAPE);
      r.keyRelease(KeyEvent.VK_ESCAPE);
	}

}
