package Mavenp.maven1t;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

//import com_selem.MasterLaunch;

public class X_path2Extent extends MasterLaunch
{
	private static final Logger log =Logger.getLogger(X_path2Extent.class);

	public static void main(String[] args) throws Exception
	{
		init();
		test= report.startTest("X_path2Extent");
		test.log(LogStatus.INFO, "Initializing properties file....");
		
	Launch("chromebrowser");
	test.log(LogStatus.INFO, "launching browser : "+ dp.getProperty("chromebrowser"));
	
	
	NavigateUrl("facebookurl");
	test.log(LogStatus.PASS, "launching url: " + childprop.getProperty("facebookurl"));
	
	
	typeText("facebook_id","abc@yahoo.com");
	test.log(LogStatus.INFO, "Giving values(incorrect id)using locator:  "+ orprop.getProperty("facebook_id"));
	
	
	typeText("facebookpass_xpath", "123");
	test.log(LogStatus.INFO,"Giving values(incorrect password) using locator: "+orprop.getProperty("facebookpass_xpath") );
	
	
	elementClick("facebooklog_id");
	test.log(LogStatus.INFO, "clicked the button using locator: "+ orprop.getProperty("facebooklog_id"));
	
	
	report.endTest(test);
	report.flush();
	//driver.close();
	
	

	}

}
