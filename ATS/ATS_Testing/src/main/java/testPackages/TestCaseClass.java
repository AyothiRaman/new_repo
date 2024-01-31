package testPackages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import atsModules.ListDemand;
import atsModules.LoginPage;
import browserDetails.BrowserFactory;
import browserDetails.ScreenShot;

public class TestCaseClass extends HelperClass {

	public TestCaseClass() {

	}

	@Test
	public void returnResults() {

		try {
			System.out.println("ATS Page Starting");

			driver.get("https://ats-test.vercel.app");

			// LOGIN PAGE

			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

			loginPage.loginWordPress("atstestingteam@sightspectrum.in", "TESTINGTEAM#123");

			// ADD DEMAND
//
//			AddDemand demand = PageFactory.initElements(driver, AddDemand.class);
//			demand.addDemandPress("JAVA DEVELOPER", "23", "Barclays", "Achieved 100% of call performance goals for accuracy, speed, volume, resolution of issues, and customer satisfaction", 
//					                     "Sightspectrum", "Spectrum", "JAVA786", "Visual Basics", "1",
//					                            "2", "Some industries mandate current certifications to even be considered for employment. If that is your field, a separate certification category can make it easy for an interviewer to scan your resume and find your current licenses and certifications quickly");
//			
//		//	demand.addAndClosingExperienceOption();
//
//			demand.dueDate();
//
//			//demand.unAssigned();
//
//			Thread.sleep(3000);
//			demand.status();
//			demand.priority();
//			demand.noticePeriod();
//			demand.minExperienceYears();
//			demand.minExperienceMonths();
//			demand.maxExperienceYears();
//			demand.maxExperienceMonths();
//			demand.modeOfHire();
//			
//			demand.maxiAndMiniWindow();
//			demand.closeWindow();
//			demand.closingDiscardChangesWindow();
//			demand.saveAndClose();
//			demand.discardChangesWindow();
////
//			// DEMAND LIST

			ListDemand dList = PageFactory.initElements(driver, ListDemand.class);

			dList.demandListValidate();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//driver.navigate().refresh();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			dList.searchOption();

			dList.receivedDateSorting();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,-200)");
			 dList.hyperLink();
			
			Thread.sleep(2000);
			dList.saveAndCloseDemand();

			Thread.sleep(2000);

			dList.addSubmission();
			dList.addSubmissionData();
			dList.saveAndcloseAddsubmission();

			// dList.demandID();
			Thread.sleep(2000);
			dList.downloadDemandListDetails();
			dList.saveAndClose();

			// ADD EMPLOYEE
//
//			AddEmployee employee = PageFactory.initElements(driver, AddEmployee.class);
//			employee.employeePress("raman", "sandy", "njosoodpkkkfn@gmail.com", "6768954567", "chennai", "banglore",
//					"tamil nadu", "465789", "BWXPA6128F", "409904820466");
//
//			// drop down
//			
//			employee.role();
//			employee.status();
//			employee.jobRole();
//			employee.location();
//			employee.gender();
//			employee.maritalStatus();
//
//			// date selection
//			employee.dateOfHire();
//			employee.dateOfBirth();
//			employee.dateOfJoining();
//			
//			
//			employee.minAndMaxWindow();
//			employee.closeWindow();
//			employee.closingDiscardChanges();
//
//			employee.saveAndClose();
//			Thread.sleep(2000);
//			employee.discardChangesOption();
//			
			// employee.alertAccept();

//			// EMPLOYEE LIST
//

//			ListEmployee eList = PageFactory.initElements(driver, ListEmployee.class);
//
//			eList.EmployeeListTest();
//			driver.navigate().refresh();
//			Thread.sleep(2000);
//			
//			//eList.searchOption();
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(200,0)","");
//			eList.hyperLink();
//			Thread.sleep(4000);
//			eList.saveAndCloseEdit();
//			
//			Thread.sleep(2000);
//			eList.sortingfirstName();
//
//
//			Thread.sleep(3000);
//			eList.employeeID();
//			Thread.sleep(2000);
//			eList.saveClose();
//			

//
//			// ADD CANDIDATE
//
//			AddCandidate candidate = PageFactory.initElements(driver, AddCandidate.class);
//
//			candidate.addCandidatePress("21000", "john", "wick", "abc@gmail.com", "8904789089", "bnglr", "hubli",
//					"123456", "spectrum", "developer", "30000", "Technology", "24lpa", "sql", "banglore", "andhra",
//					"java, python", "2", "3");
//			
//			//candidate.addAndCloseExperienceDetails();
//			//candidate.addAndCloseEmploymentDetails();
//			candidate.startDate();
//			candidate.endDate();
//
//			candidate.status();
//			candidate.noticePeriod();
//			 Thread.sleep(2000);
//
//			candidate.modeOfHire();
//			
//			candidate.gender();
//			candidate.workModel();
//			candidate.empType();
//
//			Thread.sleep(2000);
//			candidate.maxiAndMini();
//
//			candidate.closeWindow();
//			candidate.closingDiscardChanges();
//			candidate.saveAndClose();
//			Thread.sleep(2000);
//			candidate.discardChangesOption();

			// CANDIDATE LIST
//
//			ListCandidate candi = PageFactory.initElements(driver, ListCandidate.class);
//
//			candi.candidateListValidate();
//			//driver.navigate().refresh();
////			JavascriptExecutor js = (JavascriptExecutor)driver;
////			js.executeScript("window.scrollBy(400,0)","");
//			Thread.sleep(2000);
//			
//		//	candi.searchOption();
//			candi.hyperLink();
//			Thread.sleep(2000);
//
//			candi.saveAndClose();
//			Thread.sleep(2000);
//			candi.candidateID();
//			Thread.sleep(3000);
//			candi.saveCloseID();

			// SCREENSHOT

			String capture = System.getProperty("user.dir") + "\\" + "ScreenShots\\Details"
					+ ScreenShot.getDateTimeStamp() + ".png";

			try {
				ScreenShot.getScreenShot(BrowserFactory.getDriver(), capture);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
