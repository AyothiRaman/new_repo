package alerts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        
        driver.switchTo().frame("iframeResult");
        
        WebElement alertButton = driver.findElement(By.cssSelector("html>body>button"));

        WebDriverWait wait = new WebDriverWait(driver,null,null);
        wait.wait(10);
        //Click alert button ("Try it" button)
        alertButton.click();

        //Alert Message (Expected Text)
        String expectedAlertMessage = "I am an alert box!";
        
        Thread.sleep(4000);

        //Captured Alert Text (Actual Text)
        String actualAlertMessage = driver.switchTo().alert().getText();

        //Assertion
        Assertions.assertEquals(expectedAlertMessage, actualAlertMessage);

        //Accept the alert (Click OK)
        driver.switchTo().alert().accept();

	}

}
