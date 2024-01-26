package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	//For Parallel execution we Need to add this constructor for every page for calling the chrome driver
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		//Need to add driver within constructor for parallel execution
		return new LeadsPage(driver);
}

}
