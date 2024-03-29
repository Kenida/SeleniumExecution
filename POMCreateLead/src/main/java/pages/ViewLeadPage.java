package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	
	//For Parallel execution we Need to add this constructor for every page for calling the chrome driver
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLeadPage verifyCname() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;
}
}
