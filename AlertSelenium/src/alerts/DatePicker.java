package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SSLTP11229\\Desktop\\Sele\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://sight-spectrum-ats.vercel.app");

		String text = driver.findElement(By.xpath("//span")).getText();
		System.out.println(text);

	}

}
