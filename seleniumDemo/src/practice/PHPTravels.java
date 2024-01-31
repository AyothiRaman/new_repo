package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravels {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.lambdatest.com/login");
		
		driver.manage().window().maximize();
		
//		WebElement login = driver.findElement(By.linkText("Login"));
//		login.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		email.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys("hello");
		
		WebElement logIn = driver.findElement(By.xpath("//button[@id='login-button']"));
		logIn.submit();
		
		
		
	}

}
