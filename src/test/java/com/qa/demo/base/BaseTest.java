package com.qa.demo.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.demo.factory.DriverFactory;
import com.qa.demo.pages.LoginPage;

public class BaseTest {

	WebDriver driver;

	DriverFactory df;

	protected LoginPage loginPage;

	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		driver = df.initDriver("chrome");
		loginPage = new LoginPage(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
