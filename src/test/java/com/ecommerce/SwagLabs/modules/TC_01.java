package com.ecommerce.SwagLabs.modules;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecommerce.generic.BaseClass;
import com.github.javafaker.Faker;

import objectrepository.CartPage;
import objectrepository.HomePage;

public class TC_01 extends BaseClass 
{
	@Test(groups="smoke")
	public void swagLabs()
	{
		
		HomePage hp=new HomePage(driver);
		hp.getAddToCart().click();
		hp.getCart().click();
		
		CartPage cp=new CartPage(driver);
		cp.getCheckout().click();
		
		Faker f=new Faker();
			 String fn=f.name().firstName();
			 String ln=f.name().lastName();
			 String cd=f.number().digit();
		 
			cp.getFirstName().sendKeys(fn);
			cp.getLastname().sendKeys(ln);
			cp.getCode().sendKeys(cd);
			
			cp.getContin().click();
			cp.getFinish().click();
			
			String Actualname="CHECKOUT: COMPLETE!";
			
			String Expectedname=cp.getResult().getText();
			
			Assert.assertEquals(Expectedname, Actualname);
			
			System.out.println(Expectedname);	
		
	}
	
	@Test(groups="regression")
	public void productnames()
	{
		List<WebElement>e=driver.findElements(By.className("inventory_item_name"));
		for(WebElement w:e)
		{
			String s=w.getText();
			System.out.println(s);
		}	}
	
	
	
	
	
	
	
	

}