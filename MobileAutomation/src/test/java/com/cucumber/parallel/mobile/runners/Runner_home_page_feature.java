package com.cucumber.parallel.mobile.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
		features="src/test/resources/features/homepage.feature",
		glue="com.cucumber.parallel.homepage.steps"	
		)
public class Runner_home_page_feature {
	
	@Test
	public void runCuke()
	{
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}

}
