package ListenerExtentClass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MylistExtentMain extends BaseTest{
	static{
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	 }
  @Test
  public void test1() {
	  driver.get("https://www.seleniumhq.org");
	  System.out.println(driver.getTitle());
	 Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
  }
  
//  @Test
//  public void test2() {
//	  driver.get("https://www.seleniumhq.org");
//	  System.out.println(driver.getTitle());
//		 Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
//             driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
//  }
}
