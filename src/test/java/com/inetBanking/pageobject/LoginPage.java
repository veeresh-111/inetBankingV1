package com.inetBanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
@FindBy(name="uid")
WebElement txtUsername;
@FindBy(name="password")
WebElement txtPassword;
@FindBy(name="btnLogin")
WebElement login;
@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
WebElement lnkLogout;
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setusername(String un)
{
	txtUsername.sendKeys(un);
}
public void setpassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}
public void clicklogin()
	{
		login.click();
	}

public void clickLogout()
{
	lnkLogout.click();
}
}

	




