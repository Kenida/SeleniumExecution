package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class Gmail_Login extends BaseClass {
	public Gmail_Login enterUsername(String uname)
	{
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(uname);
		return this;
	}
	public Gmail_Login enterPassword(String password)
	{
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
		return this;
	}
	public Dashboard clickLogin()
	{
		driver.findElement(By.xpath("//*[text()=\"Next\"]"));
		return new Dashboard();
	}
	
}
