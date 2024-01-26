package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/F01_Login.feature", 
				glue= {"com.leaftaps.pages"}, 
				monochrome=true, 
				publish=true)
public class TC001_Login_Cucumber extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality";
		authors="Hari";
		category ="Smoke";
		
	}
	
	

}
