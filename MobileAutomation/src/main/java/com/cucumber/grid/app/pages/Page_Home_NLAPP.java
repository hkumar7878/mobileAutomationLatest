package com.cucumber.grid.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Page_Home_NLAPP {
	
	private AppiumDriver<WebElement> driver;
	public Page_Home_NLAPP(AppiumDriver<WebElement> driver)
	{
		//this.driver=(AndroidDriver<MobileElement>) driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_09")
	public AndroidElement btn_Nine;
	
	@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_add")
	public AndroidElement btn_Plus;
	
	@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_05")
	public AndroidElement btn_Five;
	
	@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_equal")
	public AndroidElement btn_EqualTo;
	
	@AndroidFindBy(id="nz.co.noelleeming.mynlapp.staging:id/tv_home_page_search_bar")
	public AndroidElement searchBar;
	
	@AndroidFindBy(id="nz.co.noelleeming.mynlapp.staging:id/tv_search")
	public AndroidElement searchBarNext;
	
	public void click5Btn()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btn_Nine.click();
	
	}
	
	public void verifySearchBar()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(searchBar.isDisplayed())
			System.out.println("Search bar on home page is displayed");
		else
			System.out.println("Search bar on home page is not displayed");
	}
	
	public void typeSearchBar()
	{
		searchBarNext.sendKeys("Test Product");
	}
	
	public void clickSearchBar()
	{
		searchBar.click();
	}
}
