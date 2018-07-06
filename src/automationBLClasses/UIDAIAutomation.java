package automationBLClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import commonUtilities.CommonServices;

public class UIDAIAutomation {

	//WebDriver interface reference variable to store the browser instance..
	private static WebDriver newBrowser;
	
	// Method to Automate Search Workflow...
	public static String searchWorkflowAutomation() {

		// Step 1 : Creating the specific browser instance...
		//FirefoxDriver fireFoxBrowser = new FirefoxDriver();
		//fireFoxBrowser = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "F:\\Saradhi.Seshagiri\\geckodriver.exe");
		//newBrowser = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		WebDriver newBrowser = new ChromeDriver();
		//newBrowser = new InternetExplorerDriver();
		
		// System.setProperty("webdriver.ie.driver","F:\\Saradhi.Seshagiri\\IEDriverServer.exe");
		// WebDriver newBrowser = new InternetExplorerDriver();

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://uidai.gov.in/");

		// Additional browser settings...Maximizing the browser window..
		//newBrowser.manage().window().maximize();
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit waiting...

		// Step 3 : Business logic for automating Search workflow...
		WebElement searchIcon = newBrowser.findElement(By.id("mod-search-searchword"));
		searchIcon.click();

		WebElement searchTextBox = newBrowser.findElement(By.xpath("//*[@id='mod-search-searchword']"));
		searchTextBox.sendKeys("Aadhaar Centres");

		WebElement searchButton = newBrowser.findElement(By.xpath("//*[@id='search_header']/form/input[1]"));
		searchButton.click();
		
		// Step 4 : Close the Browser instance created...
		newBrowser.quit();

		System.out.println("Success");
		return "Success";

	}

	// Automation of handling the popup windows...
	public static void automationOfManagingWindows() throws IOException {

		//System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		//WebDriver newBrowser = new ChromeDriver();
		
		// Step 1 : Creating the specific browser instance...
		System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String browserName = br.readLine();

		newBrowser = CommonServices.getBrowserInstance(browserName);
		
		//System.setProperty("webdriver.gecko.driver", "F:\\Saradhi.Seshagiri\\geckodriver.exe");
		//newBrowser = new FirefoxDriver();
		
		// Step 2 : Loading the AUT...
		// browserDriver.get("http://docs.seleniumhq.org/");
		newBrowser.get("https://www.naukri.com/");

		// Additional step for Unconditional Synchronization/wait...
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser window....
		//newBrowser.manage().window().maximize();

		// Step 3 : Automation Business logic for Managing the poped up windows...
		/*Methods to support retrieving the Unique Alphanumeric ID : 1. getWindowHandle()
																	 2. getWindowHandles()*/
		Set<String> windowsId = newBrowser.getWindowHandles();

		for (String handle : windowsId) {
			newBrowser.switchTo().window(handle);

			System.out.println(newBrowser.getTitle());

			// if(!"Jobs - Recruitment - Job Search - Employment - Job Vacancies
			// - Naukri.com".equalsIgnoreCase(driver.getTitle()))
			if (!"Automation...".equalsIgnoreCase(newBrowser.getTitle())) {
				newBrowser.close();
				System.out.println("Closed !!!");
			}
		} // Scope of handle variable...

		System.out.println("Success...");

		// Step 4. Closing the browser instances..
		newBrowser.quit();
	}

	// Method to Automate Handling of Alerts Workflow...
	public static void alertPopupWorkflowAutomation() throws InterruptedException, IOException {
		
		try {

		// Step 1 : Creating the specific browser instance...
		System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String browserName = br.readLine();

		newBrowser = CommonServices.getBrowserInstance(browserName);

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://uidai.gov.in/");

		// Additional browser settings...Maximizing the browser window..
		newBrowser.manage().window().maximize();

		// Implementing Unconditional Synchronization...
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 3 : Business logic for automating Alerts Popups workflow...
		WebElement resourceLinkText = newBrowser.findElement(By.cssSelector("a.item-108.deeper.parent.mega-item-a.dropTrigger"));
		resourceLinkText.click();

		WebElement authenticationLinkText = newBrowser.findElement(By.xpath("//*[@id='main245']/a"));
		authenticationLinkText.click();
		
		WebElement biometricLinkText = newBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/p[3]/span/a"));
		biometricLinkText.click();

		// Business Logic for Handling Alert popup...
		Alert biometericAlert = newBrowser.switchTo().alert(); // Switching the focus to the alert popup...
		biometericAlert.accept();

		// Making the thread idealize for 10 sec...
		Thread.sleep(20000);
		
		}
		catch(NoSuchElementException nsee) {
			nsee.printStackTrace();
		}
		catch(org.openqa.selenium.TimeoutException te) {
			te.printStackTrace();
		}
		finally {
		
			// Step 4 : Close the Browser instance created...
			newBrowser.quit();
		}

		System.out.println("Success..Handling Popups...");

	}

	// Method to Automate working with Mouse and keyboard events...
	public static void mouseKeyBoardWorkflowAutomation() throws IOException {

		// Step 1 : Creating the specific browser instance...
		System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String browserName = br.readLine();

		newBrowser = CommonServices.getBrowserInstance(browserName);

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://uidai.gov.in/");

		// Additional browser settings...Maximizing the browser window..
		//newBrowser.manage().window().maximize();

		// Implementing Unconditional Synchronization...
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 3 : Business logic for automating Alerts Popups workflow...
		WebElement resourceLinkText = newBrowser.findElement(By.cssSelector("a.item-108.deeper.parent.mega-item-a.dropTrigger"));
		WebElement authenticationLinkText = newBrowser.findElement(By.xpath("//*[@id='main245']/a"));
		WebElement biometricLinkText = newBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/p[3]/span/a"));

		//Advance User Interactions API...
		Actions mouseActions =  new Actions(newBrowser);
		Action mouseEvents = mouseActions.moveToElement(resourceLinkText).click()
										 .moveToElement(authenticationLinkText).click()
										 .moveToElement(biometricLinkText).click()
										 .build();
		
		mouseEvents.perform();

		// Step 4 : Close the Browser instance created...
		newBrowser.quit();

		System.out.println("Success..Handling Popups...");

	}

	
		// Method to Automate Search Workflow...
		public static void searchWorkflowAutomationUsingAUIAPI() throws IOException {

			// Step 1 : Creating the specific browser instance...
			System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String browserName = br.readLine();

			newBrowser = CommonServices.getBrowserInstance(browserName);

			// Step 2 : Loading the Web Application onto the Browser instance...
			newBrowser.get("https://uidai.gov.in/");

			// Additional browser settings...Maximizing the browser window..
			//newBrowser.manage().window().maximize();
			newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit waiting...

			// Step 3 : Business logic for automating Search workflow...
			WebElement searchIcon = newBrowser.findElement(By.id("mod-search-searchword"));
			WebElement searchTextBox = newBrowser.findElement(By.xpath("//*[@id='mod-search-searchword']"));
			WebElement searchButton = newBrowser.findElement(By.xpath("//*[@id='search_header']/form/input[1]"));

			//Advance User Interactions API...
			Actions mouseActions =  new Actions(newBrowser);
			Action mouseEvents = mouseActions.moveToElement(searchIcon).click()
											 .sendKeys(searchTextBox, "Aadhar Centres")
											 .moveToElement(searchButton).click()
											 .build();
			
			mouseEvents.perform(); //Execute all the events as a batch of events..
			
			// Step 4 : Close the Browser instance created...
			newBrowser.quit();

			System.out.println("Success");

		}
		
		
		// Method to Automate Drag And Drop Feature...
		public static void automationOfDragAndDropEvent() throws IOException {

			// Step 1 : Creating the specific browser instance...
			System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String browserName = br.readLine();

			newBrowser = CommonServices.getBrowserInstance(browserName);

			// Step 2 : Loading the Web Application onto the Browser instance...
			newBrowser.get("http://jqueryui.com/droppable/#default");

			// Additional browser settings...Maximizing the browser window..
			newBrowser.manage().window().maximize();
			newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit waiting...

			// Step 3 : Business logic for automating Drag And Drop Feature...
			// Script for dragging an element and dropping it in another place...
			Actions dragDropAction = new Actions(newBrowser);
			
		    WebElement iFrame = newBrowser.findElement(By.tagName("iframe"));
		    newBrowser.switchTo().frame(iFrame);
		 
		    WebElement From = newBrowser.findElement(By.id("draggable"));
		    System.out.println(From.getLocation());
		 
		    WebElement To = newBrowser.findElement(By.id("droppable"));
		    System.out.println(To.getLocation());
		 
		    dragDropAction.dragAndDrop(From, To).build().perform();
					
			// Step 4 : Close the Browser instance created...
			newBrowser.quit();

			System.out.println("Success");

		}
}
