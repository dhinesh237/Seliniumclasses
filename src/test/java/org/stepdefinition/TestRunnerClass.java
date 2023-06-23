package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/sample.Feature",
glue = "org.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
snippets = SnippetType.UNDERSCORE,
plugin = {"html:Report" ,"junit:Report\\junitreport.xml", "json:Report\\jsonreport.json"})
public class TestRunnerClass {
	
	
}
