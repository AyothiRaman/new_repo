package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\SSLTP11229\\Desktop\\selenium\\fireFoxDriver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://amazon.in/");

	}

}
