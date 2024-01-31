package zSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();
		String url = "https://phptravel.com";
		drive.get(url);

//		if(url.equals(url)) {
//			System.out.println("correct url=="+url);
//		}
//		else {
//			System.out.println("not correct");
//		}
//		
//		System.out.println(drive.getTitle());

		By f = By.id("DrpDwnMn0-ql1label");
		drive.findElement(f).click();
		
//		String pageSource = drive.getPageSource();
//		System.out.println(pageSource);
		
		Thread.sleep(4000);
		drive.navigate().to("https://amazon.in");
		
		String currentUrl = drive.getCurrentUrl();
		System.out.println(currentUrl);
		
		drive.findElement(By.id("twotabsearchtextbox"))
		.sendKeys("wildcraft backpacks");
		
		drive.findElement(By.id("nav-search-submit-button")).click();
		
		//drive.findElement(By.className("a-section aok-relative s-image-tall-aspect")).click();
		
		drive.quit();
	}

}
