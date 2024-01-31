package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSelenium {

	
	public static void main(String[] args) throws InterruptedException {
     // set the path of the executable browser driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	//	Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
		//Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	//	driver.findElement(By.className("s-image")).click();
	//	driver.findElement(By.className("a-expander-prompt")).click();
		
		driver.navigate().to("http://edureka.co/blog");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		driver.quit();
//		
//		
//		
//	
//		
//		driver.get("http://www.facebook.com");
//	WebElement ele=	driver.findElement(By.id("email"));
//	driver.manage().window().maximize();
//		Select select = new Select(ele);
//		Thread.sleep(3000);
//		select.selectByIndex(20);

		
	}

}
