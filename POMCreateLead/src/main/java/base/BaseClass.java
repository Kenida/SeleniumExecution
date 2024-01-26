package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utils.ExcelwithTc;



public class BaseClass {
	
	//For Parallel execution, remvoe Static keyword
	public static ChromeDriver driver;
	public String filename;
	//For Sequential execution i need to add static keyword
	//public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="getdata",indices= {1})
	public String[][] setdata() throws IOException{
		//step4-
		//if using as static method -call directly 
		//classname.methodname()
		
		return ExcelwithTc.runExcelData(filename); 
}
}
