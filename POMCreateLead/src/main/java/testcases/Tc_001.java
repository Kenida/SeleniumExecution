package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Gmail_Login;
import pages.LoginPage;

public class Tc_001 extends BaseClass{
	@Test
	public void runLogin() {
		//Need to add driver within constructor for parallel execution
		Gmail_Login lp=new Gmail_Login();
		lp.enterUsername("josephinekenida").enterPassword("JassJobin").clickLogin();
	}
}
