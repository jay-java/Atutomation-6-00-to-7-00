package listener;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBListener implements ITestListener{

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
		WebDriver driver =(WebDriver)result.getTestContext().getAttribute("driver");
		
		TakesScreenshot ssScreenshot = (TakesScreenshot)driver;
		File source = ssScreenshot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("D:\\ss\\"+source.getName()+".png");
		try {
			FileUtils.copyFile(source, destFile);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finished");
	}
}
