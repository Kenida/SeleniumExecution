package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	
	//For Parallel execution we Need to add this constructor for every page for calling the chrome driver
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Need to add driver within constructor for parallel execution
		return new MyHomePage(driver);
}
}
