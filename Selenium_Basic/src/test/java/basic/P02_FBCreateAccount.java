package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P02_FBCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement CA = driver.findElement(By.linkText("Create new account"));
		CA.click();
		
		Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("selenium");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("learning");
		
		WebElement mo = driver.findElement(By.name("reg_email__"));
		mo.sendKeys("987654321");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("password");
	}
}
