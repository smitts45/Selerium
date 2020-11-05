package Mavenp.maven1t;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import pracSelem.ExtentManager;

public class MasterLaunch {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static String projectpath= System.getProperty("user.dir");
	public static Properties dp;
	public static Properties parentprop;
	public static Properties childprop;
	public static Properties orprop;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static void init() throws Exception
	{
		fis= new FileInputStream(projectpath +"//data.Properties");
		dp = new Properties();
		dp.load(fis);
		
		fis= new FileInputStream(projectpath +"//environment.Properties");
		parentprop= new Properties();
		parentprop.load(fis);
		String e= parentprop.getProperty("env");
		System.out.println(e);
		
		fis= new FileInputStream(projectpath+ "//"+ e + ".properties");
		childprop= new Properties();
		childprop.load(fis);
		System.out.println(childprop.getProperty("amazon"));
		
		fis=new FileInputStream(projectpath+ "//or.properties");
		orprop= new Properties();
		orprop.load(fis);
		
		fis=new FileInputStream(projectpath + "//log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		
		report= ExtentManager.getInstance();
		
		
	}
	
	public static void Launch(String browser) 
	{
		if(dp.getProperty(browser).equals("chrome"))
		{
			ChromeOptions option= new ChromeOptions();
option.addArguments("user-data-dir=C:\\Users\\nstar\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3");
			driver= new ChromeDriver(option);
			
		}else if (dp.getProperty(browser).equals("firefox"))
		
		{
			ProfilesIni p= new ProfilesIni();
			FirefoxProfile profile = p.getProfile("seleniumP1");
			FirefoxOptions option= new FirefoxOptions();
			option.setProfile(profile);
			driver= new FirefoxDriver(option);
			profile.setPreference("dom.webnotifications.enabled", false);
		}
	}
	public static void NavigateUrl(String url)
	{
		driver.get(childprop.getProperty(url));
		
	}
	public static void elementClick(String locatorkey) 
	{
		getElement(locatorkey).click();
		//driver.findElement(By.id(orprop.getProperty(locatorkey))).click(); no need
	}

	

	public static void typeText(String locatorkey, String text) 
	{
		getElement(locatorkey).sendKeys(text);
		//driver.findElement(By.id(orprop.getProperty(locatorkey))).sendKeys(text);;
	
	}

	public static void selectOption(String locatorkey, String option) 
	{
		getElement(locatorkey).sendKeys(option);
		//driver.findElement(By.id(orprop.getProperty(locatorkey))).sendKeys(option);;
		
	}
	
	public static WebElement getElement(String locatorkey)
	{
		WebElement element= null;
		if (locatorkey.endsWith("_id")) 
		{
			element=driver.findElement(By.id(orprop.getProperty(locatorkey)));
		}else if(locatorkey.endsWith("_name"))
		{
			element= driver.findElement(By.name(orprop.getProperty(locatorkey)));
		}else if(locatorkey.endsWith("_xpath"))
		{
			element=driver.findElement(By.xpath(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_classname"))
		{
			element=driver.findElement(By.className(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_css"))
		{
			element=driver.findElement(By.cssSelector(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_linktext"))
		{
			element=driver.findElement(By.linkText(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_partiallinktext"))
		{
			element=driver.findElement(By.partialLinkText(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_tagname"))
		{
			element=driver.findElement(By.tagName(orprop.getProperty(locatorkey)));
		}
		return element;	
	}
	

	public static void reportSuccess(String PassMsg)
	{
		test.log(LogStatus.PASS, PassMsg);	
	}

	public static void reportFailure(String FailMsg) 
	{
		test.log(LogStatus.FAIL, FailMsg);
	}

	public static boolean isLinkEqual(String expectedlink) 
	{
		String actuallink = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).getText();//innerHTML,href,classname
		if(actuallink.equals(expectedlink))
			return true;
		else
			return false;
	}
	public static void screenshotf() throws Exception 
	{
		Date dt= new Date();
		String	s=dt.toString().replace(':', '_').replace(' ','_')+".png";
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File( projectpath+"\\failurescreenshot\\"+ s));
		test.log(LogStatus.INFO,"Screenshot...." + test.addScreenCapture(projectpath +"\\failurescreenshot\\"+ s));
	}
	
}
