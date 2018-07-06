package automationBLClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//Automation of Workflows in LendinGtree.com web Application...
public class LendingTreeAutomation {

	// Method to Automate Personal Loans Workflow...
	public static void personalLoanWorkflowAutomation() {

		// Step 1 : Creating the specific browser instance...
		// FirefoxDriver fireFoxBrowser = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		WebDriver newBrowser = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "F:\\Saradhi.Seshagiri\\IEDriverServer.exe"); WebDriver newBrowser =
		 * new InternetExplorerDriver();
		 */

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://www.lendingtree.com/");

		// Step 3 : Business logic for automating Personal loan workflow...
		WebElement personalLoanElement = newBrowser.findElement(By.xpath("/html/body/section/main/div[2]/div/div/div/div/div[1]/div[3]/a/button"));
		// WebElement personalLoanElement = newBrowser.findElement(By.className("tactile-circ"));
		// WebElement personalLoanElement =
		// newBrowser.findElement(By.id("wp-personal"));
		personalLoanElement.click();

		// Step 4 : Close the Browser instance created...
		newBrowser.quit();

	}

	// Method to Automate Search Workflow...
	public static void searchWorkflowAutomation() {

		// Step 1 : Creating the specific browser instance...
		// FirefoxDriver fireFoxBrowser = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		WebDriver newBrowser = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "F:\\Saradhi.Seshagiri\\IEDriverServer.exe"); WebDriver newBrowser =
		 * new InternetExplorerDriver();
		 */

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://www.lendingtree.com/");

		// Step 3 : Business logic for automating Personal loan workflow...
		WebElement searchIcon = newBrowser.findElement(By.xpath("/html/body/header/div[2]/ul/li[8]/a/span"));
		searchIcon.click();
		
		WebElement searchTextBox = newBrowser.findElement(By.className("search-field"));
		searchTextBox.sendKeys("Personal Loans");
		
		WebElement searchButton = newBrowser.findElement(By.className("search-submit"));
		searchButton.click();

		// Step 4 : Close the Browser instance created...
		newBrowser.quit();

	}

}
