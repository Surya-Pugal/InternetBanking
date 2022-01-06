package com.internetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String username="mngr378052";
	public String password="mEgenyb";
	public  WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Testing\\EclipseSpace\\inetBanking\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
		
	}

}
