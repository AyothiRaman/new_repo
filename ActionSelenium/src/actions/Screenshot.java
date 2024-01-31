package actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	//	FileUtils.copyFile(source, new File("C:\\Users\\SSLTP11229\\Documents\\kick\\screen.png"));
		FileUtils.copyFile(source, new File("./ScreenShot/ActionSelenium.png"));
		System.out.println("screenshot taken sucessfully");
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
