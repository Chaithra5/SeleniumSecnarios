package ListenerExtentClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class MyListenerExtentDemo extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test.log(Status.INFO,"Test started in the Test method"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
     test.log(Status.PASS,"Test passed in the Test method"+result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
        	test.log(Status.FAIL, "Test Failed in the Test case"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
           test.log(Status.SKIP, "Test skipped in the Test case"+result.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
