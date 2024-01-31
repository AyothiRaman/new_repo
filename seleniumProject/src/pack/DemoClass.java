package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SSLTP11229\\Desktop\\selenium\\chromeDriver\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https:\\www.gmail.com");
		Thread.sleep(4000);
		drive.findElement(By.id("identifierId")).sendKeys("abc@gmail.com");
		//drive.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		
		
		String st = drive.getTitle();
		String bt = "gmail";
		Thread.sleep(5000);
		 drive.close();
		 
		 
		 // condition
		 
		 if(st.equalsIgnoreCase(bt)) {
			 System.out.println("test sucessful");
		 }
		 else {
			 System.out.println("test failure");
		 }
		
		
	}
	
	


}
