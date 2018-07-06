package automationBLClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonUtilities.CommonServices;

public class NetAppActiveIQ {
	
	//Instance Variables..
	private static WebDriver newBrowserDriver;
	private static String applicationURL = "https://mysupport.netapp.com/info/web/AboutAIQ.html";
	
	//Automation Workflows Methods...
	public static boolean automationOfSearchWorkflow(){
		
		//Step 1 : Creating Browser Instance...
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitendrp\\Desktop\\AutoMation_Training\\chromedriver.exe");
		newBrowserDriver = new ChromeDriver();
		
		//Step 2: Launching the browser instance and loading the AUT...
		newBrowserDriver.get(applicationURL);
		
		//Synchronizing the Web Driver with Browser...
		//Implicit Synchronization...Unconditional wait...
		newBrowserDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		newBrowserDriver.manage().window().maximize();
		
		//Step 3 : Business logic for automation of Search workflow..
		WebElement searchTextBox = newBrowserDriver.findElement(By.xpath("//*[@id='headerSearchInput']"));
		searchTextBox.click();
		searchTextBox.sendKeys("Tapes");
		
		WebElement searchButton = newBrowserDriver.findElement(By.id("searchButton"));
		searchButton.click();
		
		//Step 4 : Closing the Browser Instance...
		newBrowserDriver.quit();
		
		System.out.println("Success....");
		
		return true;

	}
	
		public static String automationOfLogin() throws InterruptedException {
		
		//Step 1 : Creating Browser Instance...
		ChromeOptions additionalProperties =  new ChromeOptions();
		additionalProperties.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitendrp\\Desktop\\AutoMation_Training\\chromedriver.exe");
		newBrowserDriver = new ChromeDriver(additionalProperties);
		
		//Step 2: Launching the browser instance and loading the AUT...
		newBrowserDriver.get(applicationURL);
		
		//Synchronizing the Web Driver with Browser...
		//Implicit Synchronization...Unconditional wait...
		newBrowserDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Maximizing the browser...
		//newBrowserDriver.manage().window().maximize();
		
		//Step 3 : Business logic for automation of ActiveIQ Login workflow..
		WebElement launchingActiveIQLink = newBrowserDriver.findElement(By.xpath("//*[@id='outerMain']/div[5]/div/div/div[1]/div[1]/p[2]/a"));
		launchingActiveIQLink.click();
		
		Thread.sleep(20000);
		
		//Step 4 : Closing the Browser Instance...
		newBrowserDriver.quit();
		
		System.out.println("Success....");
		return "Success";

	}
}
