package clientInterfaces;

import automationBLClasses.NetAppActiveIQ;

public class NetAppClient {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Creating Objects for NetApp Web APP...
		  NetAppActiveIQ newNetApp = new NetAppActiveIQ();
		  newNetApp.automationOfSearchWorkflow();
		
		//newNetApp.automationOfLogin();

	}

}
