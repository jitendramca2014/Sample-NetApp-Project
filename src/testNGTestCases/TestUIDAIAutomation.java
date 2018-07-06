package testNGTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationBLClasses.UIDAIAutomation;

public class TestUIDAIAutomation {

	//@Test
	// Method to Automate working with Mouse and keyboard events...
	/*public void testMouseKeyBoardWorkflowAutomation() {

		// Step 1 : Creating the specific browser instance...
		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		WebDriver newBrowser = new ChromeDriver();

		// System.setProperty("webdriver.ie.driver","F:\\Saradhi.Seshagiri\\IEDriverServer.exe");
		// WebDriver newBrowser = new InternetExplorerDriver();

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://uidai.gov.in/");

		// Additional browser settings...Maximizing the browser window..
		newBrowser.manage().window().maximize();

		// Implementing Unconditional Synchronization...
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 3 : Business logic for automating Alerts Popups workflow...
		WebElement resourceLinkText = newBrowser
				.findElement(By.cssSelector("a.item-108.deeper.parent.mega-item-a.dropTrigger"));

		// Advance User Interaction API...
		Actions mouseActions = new Actions(newBrowser);
		Action mouseEvents = mouseActions.moveToElement(resourceLinkText).click().build();

		mouseEvents.perform();

		// Step 4 : Close the Browser instance created...
		newBrowser.quit();

		System.out.println("Success..Handling Popups...");

	}*/
	
	@Test
	public void testsearchWorkflowAutomation(){
		
		String actualReturnValue = null;
		
		actualReturnValue = UIDAIAutomation.searchWorkflowAutomation();
		Assert.assertEquals(actualReturnValue, "Succes");
	}
	
}
