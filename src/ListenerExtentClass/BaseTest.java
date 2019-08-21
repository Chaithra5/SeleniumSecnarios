package ListenerExtentClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
static ExtentTest test;
	WebDriver driver;
	@BeforeSuite
	  public void Bsuit() {
htmlReporter =new ExtentHtmlReporter(new File("C:\\Users\\User\\Documents\\chaithra_pgm\\Selenium_project2\\ReportGenerate\\rep1.html"));
	 extent=new ExtentReports();
	 extent.attachReporter(htmlReporter);
	 test = extent.createTest("HomePageTest");
	}
  @BeforeMethod
  public void Bmethod()
  {
	   driver= new ChromeDriver();
  }
  @AfterMethod
  public void AMethod() {
	  driver.close();
  }

  @AfterSuite
  public void ASuite() {
	  extent.flush();
  }

}
