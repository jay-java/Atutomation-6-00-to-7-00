package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import connection.DriverConnection;

public class P005_Alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.getDriver("https://demoqa.com/alerts");
		
		//1.alert
//		WebElement btn = driver.findElement(By.id("alertButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();	
		
		//2.after some duration
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement btn = driver.findElement(By.id("timerAlertButton"));
//		btn.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		//3.alert with options ok/cancel
//		WebElement btn = driver.findElement(By.id("confirmButton"));	
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
		
		//4.alert with data
		WebElement btn = driver.findElement(By.id("promtButton"));
		btn.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("selenium learning");
		alert.accept();
	}
}
