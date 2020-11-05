package Mavenp.maven1t;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

//import com_selem.MasterLaunch;

public class ExtentManager extends MasterLaunch
{ 
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if (report==null) 
		{
			report = new ExtentReports(projectpath + "//HtmlReports//" + "report.html");
			report.loadConfig(new File(projectpath + "//extentreportconfig.xml"));
			report.addSystemInfo("Selenium Language Binding", "3.141.59").addSystemInfo("Environment",parentprop.getProperty("env"));
		}
		return report;
	}

}