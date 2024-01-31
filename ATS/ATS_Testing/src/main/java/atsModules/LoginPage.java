package atsModules;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class LoginPage {

	private static Logger logger = LoggerFactory.getLogger(LoginPage.class);

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "TextField3")
	@CacheLookup
	WebElement emailId;

	@FindBy(how = How.ID, using = "TextField8")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.ID, using = "id__13")
	@CacheLookup
	WebElement login;

	public void loginWordPress(String emailField, String passwordField) {
		try {
			
			// Sending Data into Required fields
			emailId.sendKeys(emailField);

			password.sendKeys(passwordField);

			login.click();
			Thread.sleep(4000);

			// Getting page source

			String str = driver.getPageSource();
			System.out.println(str);

			// Verifying Title of the page

			System.out.println("Verifying the page title has started");

			String expected_title = "Sightspectrum";
			String actual_title = driver.getTitle();

			Assert.assertEquals(expected_title, actual_title);

			if (expected_title.equals(actual_title)) {
				System.out.println("+++++  title is correct  ++++++++");
				logger.info("The page title has been successfully verified");

			} else {
				System.out.println("wrong title");
			}

			System.out.println("User logged in successfully");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
