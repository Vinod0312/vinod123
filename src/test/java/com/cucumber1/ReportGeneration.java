package com.cucumber1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	public static void generateReport(String json) {
		
		File f=new File("C:\\Users\\LENOVO\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\Reports");
		Configuration config = new Configuration(f, "CucumberTest");
		 config.addClassifications("platform","win 10");
		 config.addClassifications("Browser", "Chrome");
		 config.addClassifications("Date", "26/05/2022");
		 
		 
		 List<String> l =new ArrayList<String>();
		 l.add(json);
		 ReportBuilder builder= new ReportBuilder(l, config);
		 builder.generateReports();
		 
		 
		
	}

	
		
	

}
