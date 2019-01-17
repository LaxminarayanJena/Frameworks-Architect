package com.Jena.cucumber.prallel.google.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/com/Jena/cucumber/parallel/google/features/Search-many.feature",
		glue="com.Jena.cucumber.parallel.google",
		monochrome=true		
		)


public class SearchManyFeature   extends AbstractTestNGCucumberTests{

}


