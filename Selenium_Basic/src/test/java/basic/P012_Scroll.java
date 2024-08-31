package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P012_Scroll {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//1.Scroll by pixels
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,150)", "");
		
		//2.By element
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement btn = driver.findElement(By.id("uploadPicture"));
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", btn);
//		Thread.sleep(4000);
//		btn.sendKeys("C:\\Users\\jay-pc\\Downloads\\shirt.jpg");
		
		//3.scroll by window
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
