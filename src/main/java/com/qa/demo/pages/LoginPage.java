package com.qa.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demo.utils.ElementUtils;

public class LoginPage {

	private WebDriver driver;
	ElementUtils eleUtils;

	private By username = By.name("emailAddress");
	private By pswd = By.name("password");
	private By loginBtn = By.xpath("//button[@type='submit']");
	private By forgotPswdLink = By.linkText("Forgot password?");
	private By baigeLogo = By.xpath("//baigeLogoPlaceholder");


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtils = new ElementUtils(driver);
	}

	// page actions/methods

	public String getLoginPageLoginTitle() {
		String title = eleUtils.waitForTitleIs("Baige Wallet", 5);
		// String title = driver.getTitle();

		System.out.println("Title is :" + title);
		return title;
	}

	public String getLoginPageURL() {
		String URL = eleUtils.waitForURLContains("dev-admin-app.eks-baige.com", 5);

		// String URL = driver.getCurrentUrl();
		System.out.println("Current URL is :" + URL);
		return URL;
	}

	public boolean IsForgotPasswordLinkExist() {
		return eleUtils.waitForVisibilityOfElement(forgotPswdLink, 5).isDisplayed();
		//return driver.findElement(forgotPswdLink).isDisplayed();
	}

	public boolean IsBaigeLogoExist() {
		return eleUtils.waitForVisibilityOfElement(baigeLogo, 5).isDisplayed();
		//return driver.findElement(forgotPswdLink).isDisplayed();
	}

	public boolean doLogin(String userName, String password) {
		
		eleUtils.waitForVisibilityOfElement(username, 10).sendKeys(userName);
		eleUtils.doSendKeys(pswd, password);
		eleUtils.doClick(loginBtn);
		return true;
		
		/*
		 * driver.findElement(username).sendKeys(userName);
		 * driver.findElement(pswd).sendKeys(password);
		 * 
		 * driver.findElement(loginBtn).click();
		 * System.out.println("User is logged in");
		 */
		
	}
}
