package com.cucumber.grid.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Page_Home {
	
	private AppiumDriver<WebElement> driver;
	public Page_Home(AppiumDriver<WebElement> driver)
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
}
