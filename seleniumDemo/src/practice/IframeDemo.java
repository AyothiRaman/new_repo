package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		//switch to frame using index
		
	//	driver.switchTo().frame(0);
		
		//switch to frame with frame id
		
		driver.switchTo().frame("mce_0_ifr");

		WebElement ele = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("hello everyone");

		Thread.sleep(3000);
		// here the error will be occur because we are in iframe tag so we are 
		// accessing outside the iframe ,for that we should switch back to main webpage
		
		driver.switchTo().parentFrame();
		
		WebElement elet = driver.findElement(By.xpath("//div[@class='example']"));
		System.out.println(elet.getText());
	}
	   }