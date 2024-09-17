package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class LoginParameter {
	@Parameters({"email","password"})
	@Test
	public void loginTest(String email,String password) {
		String url="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
}
