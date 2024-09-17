package parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class CrossBrowsert {
	String url = "https://www.facebook.com/";
	
	@Parameters("browser")
	@Test
	public void browserTest(String browser) {
		if(browser.equals("chrome")) {
			WebDriver driver = DriverConnection.getDriver(url);
		}
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
		}
		if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get(url);
		}
	}
}
