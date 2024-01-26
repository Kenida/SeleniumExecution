package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LeadsPage extends BaseClass{
	
	//For Parallel execution we Need to add this constructor for every page for calling the chrome driver
	public LeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		//Need to add driver within constructor for parallel execution
		return new CreateLeadPage(driver);
}
	public FindLeads clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		//Need to add driver within constructor for parallel execution
		return new FindLeads(driver);
}
}
