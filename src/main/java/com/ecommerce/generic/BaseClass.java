package com.ecommerce.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import objectrepository.HomePage;
import objectrepository.LoginPage;


public class BaseClass 
{
	public WebDriver driver;
	public WebDriverUtilities wUtil;
	public ReadDatafromPropFile r=new ReadDatafromPropFile();

	@BeforeClass
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		wUtil=new WebDriverUtilities(driver);
		wUtil.maximize();
	}


	@BeforeMethod
	public void login() throws Exception
	{
		String Url=	r.readDataFromPropFile("url");
		String username=r.readDataFromPropFile("un");
		String pwd=r.readDataFromPropFile("pwd");
		driver.get(Url);
		wUtil.waitSynchro();
		
	LoginPage lp=new LoginPage(driver);	
	lp.getUn().sendKeys(username);;
	lp.getPwd().sendKeys(pwd);
	lp.getSubmitButton().click();;
	}


	@AfterMethod
	public void logout()
	{
		HomePage hm=new HomePage(driver);
		hm.getLogImage().click();
		hm.getLogout().click();

	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
