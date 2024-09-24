package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class FbTest {
	@Test
	public void login(ITestContext context) {
		String urlString = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(urlString);
		context.setAttribute("driver", driver);
		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		assertEquals(driver.getTitle(), "Facebook");
	}
}
