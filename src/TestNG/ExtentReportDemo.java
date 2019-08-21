package TestNG;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
	//creating report object
	ExtentReports reports=new ExtentReports();

	//creating the report                           
	ExtentTest test= reports.createTest("Test report");
  @Test
  public void demo() throws IOException {
	  //storing the test report in the given path
	  ExtentHtmlReporter rep=new  ExtentHtmlReporter("\\Users\\User\\Documents\\chaithra_pgm\\Selenium_project2\\ReportGenerate\\rep.html");
	  
	  //setting the document details
	  rep.config().setDocumentTitle("Automation");
	  rep.config().setReportName("Testing");
	  rep.config().setTheme(Theme.STANDARD);
	  //adding the screenshot
	  test.addScreenCaptureFromPath("C:\\Users\\User\\Documents\\chaithra_pgm\\Selenium_project2\\Screenshots\\IMG_20160426_174637 - Copy.jpg");
	  
	  //setting the s/m information
	  reports.attachReporter(rep);
	  reports.setSystemInfo("hostname", "chaithra");
	  reports.setSystemInfo("envname", "windows");
	  reports.setSystemInfo("projectname", "demoproject");
	//  Assert.fail();
  }
	  @AfterMethod
	  public void AfterTest(ITestResult r)
	  {
		  System.out.println(r.getMethod().getMethodName());
		  System.out.println(r.getStatus());
		  if(r.getStatus()==ITestResult.SUCCESS)
		  {
			  test.log(Status.PASS, "Test is pass");
			  reports.flush();
		  }else {
			  test.log(Status.FAIL, "Test is fail");
			  reports.flush();
		  }
	  }
	 
  }

