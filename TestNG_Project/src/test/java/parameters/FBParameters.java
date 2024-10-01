package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class FBParameters {
	
	static WebDriver driver = null;
	@BeforeClass
	public static void openBrowser() {
		String urlString = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(urlString);
	}
	@Test(dataProvider = "dp")
	public void login(String email,String password) throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "dp")
	public static Object[] getData() {
		Object o[][] = new Object[4][2];
		o[0][0] ="incorrect@gmail.com";
		o[0][1] ="incorrect@123";
		
		o[1][0] ="incorrect@gmail.com";
		o[1][1] ="correct@123";
		
		o[2][0] ="correct@gmail.com";
		o[2][1] ="incorrect@123";
		
		o[3][0] ="correct@gmail.com";
		o[3][1] ="correct@123";
		
		return o;
	}
}
