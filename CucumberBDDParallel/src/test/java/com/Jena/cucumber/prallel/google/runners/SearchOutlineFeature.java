package com.Jena.cucumber.prallel.google.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/com/Jena/cucumber/parallel/google/features/search-outline.feature",
		glue="com.Jena.cucumber.parallel.google",
		monochrome=true	
		
		)
public class SearchOutlineFeature extends AbstractTestNGCucumberTests{

}
