package com.cucumber.parallel.mobile.runners;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.cucumber.grid.app.pages.Page_Home_NLAPP;
import com.cucumber.grid.pages.actions.Action_CalcHomePage;
import com.cucumber.grid.pages.locators.Locators_CalcHomePage;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;
import com.cucumber.parallel.baseSteps.steps.DebugerBaseClass;
import com.cucumber.parallel.baseSteps.steps.NewBaseClass;
//import com.cucumber.parallel.extent.ExtentManager;
//import com.cucumber.parallel.extent.ExtentTestManager;






import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps_Calc extends NewBaseClass{
	
	protected Scenario scenario;
	static String scenarioName;
	static int i=0;
	Action_CalcHomePage obj1= new Action_CalcHomePage();
	
	
	@Before
	public void before(Scenario scenario) throws Exception
	{
		//MyScreenRecorder.startRecording("navigationTest");
		i=i+1;
		this.scenario=scenario;
		scenarioName=scenario.getName();
		System.out.println("SCENARIO NAME FOR TEST IS " +scenarioName );
		//ExtentTestManager.startTest("Scenario No : "+i+" " + scenario.getName());
		//ExtentTestManager.getTest().log(Status.INFO, "Scenario started is :-" + scenario.getName());
		setUpFramework();
		
	}
	
	@After
	public void after(Scenario scenario) throws Exception
	{
		if(scenario.isFailed())
		{
			//ExtentTestManager.logFail("Scenario failed");
			//ExtentTestManager.addScreenShotOnFailure();
		}
		
		else
		{
			//ExtentTestManager.logPass("Scenario passed");
			
		}
		//ExtentManager.getReporter().flush();
		//MyScreenRecorder.stopRecording();
		quitAppiumDriver();
	}
	

@Given("^user launches the app$")
public void user_launches_the_app() throws Throwable { 

	//String test1=Test;
	//deviceSetUp();
	// for parallel execution, fetch values from feature file with the help of 'Example'
	Page_Home_NLAPP obj_Home= new Page_Home_NLAPP(driver);
	obj_Home.verifySearchBar();
	obj_Home.typeSearchBar();

    
}

@Then("^user clicks on one digit button$")
public void user_clicks_on_one_digit_button() throws Throwable {
	
    
}

@Then("^user clicks on plus button$")
public void user_clicks_on_plus_button() throws Throwable {
    
}

@Then("^user clicks on two digit button$")
public void user_clicks_on_two_digit_button() throws Throwable {
   
}

@Then("^user clicks equals button$")
public void user_clicks_equals_button() throws Throwable {
  
}


	
}
