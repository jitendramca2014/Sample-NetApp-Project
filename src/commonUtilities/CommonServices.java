package commonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CommonServices {

	// Private instance variables...
	//private static WebDriver newBrowser;
	//private static String applicationURL = "https://uidai.gov.in/";

	//Method for returning the browser instance/object...
	public static WebDriver getBrowserInstance(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jitendrp\\Desktop\\AutoMation_Training\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\jitendrp\\Desktop\\AutoMation_Training\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jitendrp\\Desktop\\AutoMation_Training\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browserName.equals("opera"))
		{
			//System.setProperty()
			return new OperaDriver();
		}
		
		else if(browserName.equals("safari"))
		{
			//TODO System.setProperty()
			return new SafariDriver();
		}
		else
		{
			return new HtmlUnitDriver();
		}	
	}//End of the Method...
	
	//Method for login into SPMA application...
	public static void loginIntoSPMSApplication(WebDriver newBrowser) {
		
		WebElement userNameTextbox = newBrowser.findElement(By.name("txtUserName"));
		userNameTextbox.sendKeys("ss95957");

		// Selecting the specific Drop down option...
		WebElement passwordTextbox = newBrowser.findElement(By.name("txtPassword"));
		passwordTextbox.sendKeys("dopc@07032018");

		WebElement loginButton = newBrowser.findElement(By.name("btnlogin"));
		loginButton.click();
	}//End of the Method...
}
