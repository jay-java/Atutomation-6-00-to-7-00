package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class P002_FBCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement CA = driver.findElement(By.linkText("Create new account"));
		CA.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Thread.sleep(3000);

		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("selenium");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("learning");

		WebElement mo = driver.findElement(By.name("reg_email__"));
		mo.sendKeys("987654321");

		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("password");

		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByIndex(5);

		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("8");

		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("2024");

		List<WebElement> gender = driver.findElements(By.name("sex"));
		System.out.println(gender.size());
		gender.get(1).click();
	}
}
