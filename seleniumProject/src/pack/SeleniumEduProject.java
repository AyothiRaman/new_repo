package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumEduProject {
	static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test(priority = 0)
	public void edureka() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");

		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.edureka.co/");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		driver.findElement(By.className("signup_click signup-vd giTrackElementHeader ")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("si_popup_email")));
		Thread.sleep(4000);
		action.click();
		action.sendKeys("ayothiraman1999@gmail.com");
		Thread.sleep(3000);
		action.build().perform();

		// for giving password

		action.moveToElement(driver.findElement(By.id("si_popup_passwd")));
		Thread.sleep(4000);
		action.click();
		action.sendKeys("ayothi1999@A");
		Thread.sleep(4000);
		action.build().perform();
		
		
		WebElement ele = driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']"));
        ele.click();
        Thread.sleep(4000);
	}

//		driver.findElement(By.className("login_click login-vd giTrackElementHeader")).click();
//
//		driver.findElement(By.id("si_popup_email")).sendKeys("ayothiraman1999@gmail.com");
//
//		driver.findElement(By.id("si_popup_passwd")).sendKeys("ayothi1999@A");
//
//		driver.findElement(By.id("clik_btn_log btn-block")).click();
//
//	}

	public static void main(String[] args) throws InterruptedException {
		SeleniumEduProject si = new SeleniumEduProject();
		si.edureka();

	}

}
