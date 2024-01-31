package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		
		//Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"link\"]/child::a"));
		ele.click();
		
//		ele.sendKeys("json");
//		ele.click();
//		
		//driver.close();
		
	}

}
