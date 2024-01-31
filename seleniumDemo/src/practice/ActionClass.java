package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ele.click();
		
		ele.sendKeys("about Tamilnadu");
		Thread.sleep(4000);
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	System.out.println("entered successfully");

//	JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,800)");
	}

}
