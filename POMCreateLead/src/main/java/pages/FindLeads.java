package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeads extends BaseClass {
	public FindLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public FindLeads enterFname(String Fname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Fname);
		return this;
}
}
