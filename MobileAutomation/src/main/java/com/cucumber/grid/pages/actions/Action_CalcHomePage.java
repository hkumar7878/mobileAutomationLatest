package com.cucumber.grid.pages.actions;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.grid.pages.locators.Locators_CalcHomePage;
import com.cucumber.parallel.baseSteps.steps.NewBaseClass;

public class Action_CalcHomePage extends NewBaseClass{
	Locators_CalcHomePage obj_CalCHome= new Locators_CalcHomePage();
	
	
	public Action_CalcHomePage()
	{
		this.obj_CalCHome= new Locators_CalcHomePage();
		PageFactory.initElements(NewBaseClass.getDriver(), obj_CalCHome);
	}
	
	public void click5Btn()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//obj_CalCHome.btn_Nine.click();
	
	}
	

}
