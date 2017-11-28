package com.fourstay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin={"html:target/cucumber-report", "json:target/cucumber.json"},
		features=
	{"src/test/resources/features/fourstay_home_page.feature",
		"src/test/resources/features/fourstay_search_tests.feature"},
		glue = "com/fourstay/step_definitions"
		//tags="@Staytest_125, @Staytest_124, @search, @homepage, @login",
		//tags="@Regression",
		//dryRun=false
		
		//hello world ! ! !
		)
public class Runner {

}
