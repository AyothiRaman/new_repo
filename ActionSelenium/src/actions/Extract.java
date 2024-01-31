package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Extract {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://moi.gov.ae/en/Open.Data.aspx");
		WebElement drop_down = driver
				.findElement(By.xpath("//select[@id='ctl00_ctrlContentArea_GenericContent1_ddlYears']"));
		Actions action = new Actions(driver);

		 //action.moveToElement(element).click().perform();
		action.click(drop_down).perform();
		
		//drop_down.click();
		Select select_Year = new Select(drop_down);
		select_Year.selectByValue("2021");

		WebElement click_Search = driver
				.findElement(By.xpath("//input[@id='ctl00_ctrlContentArea_GenericContent1_btnSearch']"));
		click_Search.click();
		//Thread.sleep(2000);

		WebElement Bulk_Download = driver
				.findElement(By.xpath("//a[@id='ctl00_ctrlContentArea_GenericContent1_lnkDownload']"));
		
		Bulk_Download.click();
		 
		
	}

}
