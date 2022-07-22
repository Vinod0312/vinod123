package com.cucumber1;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="com.stepdefinition",dryRun=false,monochrome=true,
plugin={"pretty","json:C:\\Users\\LENOVO\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\Reports\\jsonreport.json"})

public class TestRunner {
	@AfterClass
	public  static void afterClass() {
		ReportGeneration.generateReport("C:\\Users\\LENOVO\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\Reports\\jsonreport.json");

	}

}
