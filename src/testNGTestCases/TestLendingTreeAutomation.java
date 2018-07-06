package testNGTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLendingTreeAutomation {

	@Test
	public void testPersonalLoanWorkflowAutomation() {

		// Step 1 : Creating the specific browser instance...
		// FirefoxDriver fireFoxBrowser = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		WebDriver newBrowser = new ChromeDriver();

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://www.lendingtree.com/");

		// Step 3 : Business logic for automating Personal loan workflow...
		WebElement personalLoanElement = newBrowser.findElement(By.xpath("/html/body/section/main/div[2]/div/div/div/div/div[1]/div[3]/a/button"));
		personalLoanElement.click();

		// Step 4 : Close the Browser instance created...
		newBrowser.quit();

	}
}
