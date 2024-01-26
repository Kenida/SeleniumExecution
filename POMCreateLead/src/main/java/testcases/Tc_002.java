package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Tc_002 extends BaseClass {
	@BeforeTest
	public void setData(){
		 filename = "CreateLeadDataSheet";
	}
	
	@Test(dataProvider = "getdata")
	public void runCreateLead(String cname,String fname,String lname) {
		//Need to add driver within constructor for parallel execution
		LoginPage lp=new LoginPage(driver);
		lp.enterUname("Demosalesmanager").enterPaswd("crmsfa").clickLogin().clickCrmsfa().clickLeads()
		.clickCreateLead().enterCname(cname).enterFname(fname).enterLname(lname).clickCreateButton().verifyCname();
	}
}
