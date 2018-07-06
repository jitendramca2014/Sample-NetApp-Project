package testNGTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationBLClasses.NetAppActiveIQ;

public class TestNetAppActiveIQ {
  @Test
  public void testautomationOfSearchWorkflow() {
	  
	  // Invoking the SearchAutomationWorkflow method....
	  boolean actualReturnValue= NetAppActiveIQ.automationOfSearchWorkflow();
	  
	  //Asserting the return value...
	  //Assert.assertEquals(actualReturnValue, true);
	   // Assert.assertEquals(actualReturnValue, false);
	  Assert.assertTrue(actualReturnValue);
	  
  }
  
  @Test
  public void testAutomationOfLogin() throws InterruptedException {
	  String actualReturnValue= NetAppActiveIQ.automationOfLogin();
	//Asserting the return value...
	  Assert.assertEquals(actualReturnValue, "Success");
	
  }
}
