package com.Jena.bdd.cucumber.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/features/validateCRM.feature",
		glue="com.Jena.cucumber.zoho.steps",
		monochrome=true		
		)


public class ValidateCRMFeatureRunner extends AbstractTestNGCucumberTests{

}

