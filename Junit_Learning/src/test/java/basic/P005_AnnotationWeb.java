package basic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import connection.DriverConnection;

public class P005_AnnotationWeb {
	
	static WebDriver driver = null;
	
	@BeforeClass
	public static void openbrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("selenium123");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
	
	
}
