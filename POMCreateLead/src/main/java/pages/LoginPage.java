package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	//For Parallel execution we Need to add this constructor for every page for calling the chrome driver
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUname(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	
		public LoginPage enterPaswd(String pass) {
			driver.findElement(By.id("password")).sendKeys(pass);
			return this;
}
		public HomePage clickLogin() {
			driver.findElement(By.className("decorativeSubmit")).click();
			//Need to add driver within constructor for parallel execution
			return new HomePage(driver);
	}
}
