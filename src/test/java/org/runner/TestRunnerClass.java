package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = { "org.Stepdef" }, plugin = { "pretty",
		"json:src/test/resources/Report/output.json" }, monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, strict = true)

public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
	ReportClass.jvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\output.json");

	}
	

}
