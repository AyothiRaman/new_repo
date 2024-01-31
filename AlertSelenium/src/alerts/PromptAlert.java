package alerts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	        //Switch to iframeResult iframe because all elements located in this iframe
	        //It will be described in next topics
	        driver.switchTo().frame("iframeResult");

	        //Find "Try it" button
	        WebElement promptButton = driver.findElement(By.cssSelector("html>body>button"));

	        //Actual Message
	        WebElement actualPromptMessage = driver.findElement(By.cssSelector("#demo"));

	        //Click confirm button ("Try it" button)
	        promptButton.click();
	        Thread.sleep(1000);

	        driver.switchTo().alert().sendKeys("Hello Testing Team");
	        Thread.sleep(1000);
	        
	      

	        //Accept the alert (Click Ok button)
	        driver.switchTo().alert().accept();

	        //Assertion
	        Assertions.assertEquals("How are you today?", actualPromptMessage.getText());
	    }
	}


