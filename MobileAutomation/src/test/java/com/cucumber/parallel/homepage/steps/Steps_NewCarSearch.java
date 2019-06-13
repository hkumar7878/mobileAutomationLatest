package com.cucumber.parallel.homepage.steps;



import com.aventstack.extentreports.Status;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;
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

public class Steps_NewCarSearch extends NewBaseClass{
	
	protected Scenario scenario;
	static String scenarioName;
	static int i=0;
	
	
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
		//setUpFramework();
		
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
		//quitWebDriver();
	}
	

@Given("^user launches the app$")
public void user_launches_the_app() throws Throwable {
	deviceSetUp("Firefox");
    // Write code here that turns the phrase above into concrete actions
    
}


	@When("^user navigates to URL '(.*?)'$")
	public void user_navigates_to_URL(String URL) throws Throwable {
	    getDriver().navigate().to(URL);
	    
	}

	
}
