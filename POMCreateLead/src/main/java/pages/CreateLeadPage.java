package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	//For Parallel execution we Need to add this constructor for every page for calling the chrome driver
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage enterCname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
}
	public CreateLeadPage enterFname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
}
	public CreateLeadPage enterLname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
}
	public ViewLeadPage clickCreateButton() {
		driver.findElement(By.name("submitButton")).click();
		//Need to add driver within constructor for parallel execution
		return new ViewLeadPage(driver);
}
}
