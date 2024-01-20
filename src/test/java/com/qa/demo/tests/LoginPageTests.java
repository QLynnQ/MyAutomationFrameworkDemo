package com.qa.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.demo.base.BaseTest;

public class LoginPageTests extends BaseTest{
	
	
	@Test(enabled = false)
	public void confirmLogoDisplayed() {
		Assert.assertTrue(loginPage.IsBaigeLogoExist());
	
	}
	
	@Test
	public void confirmForgotPasswordLinkDisplayed() {
		Assert.assertTrue(loginPage.IsForgotPasswordLinkExist());
	}
	
	@Test
	public void confirmTitleDisplayed() {
		String actTitle = loginPage.getLoginPageLoginTitle();
		Assert.assertEquals(actTitle, "Baige Wallet");
	}
	
	@Test
	public void loginTest() {
		Assert.assertTrue(loginPage.doLogin("tosineo@outlook.com", "Blonde77@1"));

	}
}
