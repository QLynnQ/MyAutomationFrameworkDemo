package com.qa.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demo.utils.ElementUtils;

public class DashboardPage {
	
	private WebDriver driver;
	ElementUtils eleUtils;



	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		eleUtils = new ElementUtils(driver);
	}


}
