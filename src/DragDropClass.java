import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import commonUtilities.CommonServices;

public class DragDropClass {
	
	private WebDriver driver;

	public void dragAndDrop() throws IOException {

	// Step 1 : Creating the specific browser instance...
	System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String browserName = br.readLine();

	driver = CommonServices.getBrowserInstance(browserName);

	// Step 2 : Loading the Web Application onto the Browser instance...
	driver.navigate().to("http://jqueryui.com/droppable/#default");

	// Additional browser settings...Maximizing the browser window..
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	// Step 3 : Business logic for automating Drag And Drop Feature...
	Actions dragdropaction = new Actions(driver);

	// Locating webelements
	WebElement iFrame1 = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	driver.switchTo().frame(iFrame1);

	WebElement srcDragElement = driver.findElement(By.id("draggable"));
	WebElement destDropElement = driver.findElement(By.id("droppable"));

	Action individualEvent = dragdropaction.dragAndDrop(srcDragElement, destDropElement).build();
	individualEvent.perform();
	driver.quit();
	System.out.println("Success");
	
	}
	}