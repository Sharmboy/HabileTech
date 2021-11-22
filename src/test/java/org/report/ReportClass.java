package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
	public static void jvmReport(String json) {
		File reportDirectory = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Report");
		Configuration config = new Configuration(reportDirectory, "Cloud Bank Automation");
		config.addClassifications("Browser", "chrome");
		config.addClassifications("Version", "95");
		config.addClassifications("OS", "10");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		builder.generateReports();

	}

}
