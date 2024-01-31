package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {


	@Test
	public void f() {
		System.out.println("test 1");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("test 2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("test 3");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("test 4");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("test 5");
	}

}
