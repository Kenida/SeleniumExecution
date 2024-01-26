package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Tc_003 extends BaseClass{
	
	@Test
	public void runFindLead() {
		//Need to add driver within constructor for parallel execution
		LoginPage lp=new LoginPage(driver);
		lp.enterUname("Demosalesmanager").enterPaswd("crmsfa").clickLogin().clickCrmsfa().clickLeads().clickFindLeads()
		.enterFname("Keni");
		
	}
}
