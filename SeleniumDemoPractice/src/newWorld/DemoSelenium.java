package newWorld;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");


		WebDriver driver = new ChromeDriver(options);
		driver.get("https://lpi.worldbank.org/report");

		WebElement button = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/aside/div/div[1]/div/div/a[1]"));

		

		String linkAddress = button.getAttribute("href");

		System.out.println("Link address of the button: " + linkAddress);
		System.out.println("Link: <a href=\"" + linkAddress + "\">" + linkAddress + "</a>");

		

	}

}
