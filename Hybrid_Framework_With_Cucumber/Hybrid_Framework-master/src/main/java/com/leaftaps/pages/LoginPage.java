package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String data) {
		//step1: locate the element
		WebElement ele = locateElement("username");
		
		//step2: interact with the WebElement
		clearAndType(ele,data);
		reportStep("Username is entered", "pass");
		return this;
	}
	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.XPATH,"//input[@id='password']"),data);
		reportStep("Password is entered", "pass");
		return this;
	}
	@When("Click on login button")
	public HomePage clickLogin() {
		click(locateElement("Login"));
		reportStep("Log In button is clicked", "pass");
		return new HomePage();
	}

}
