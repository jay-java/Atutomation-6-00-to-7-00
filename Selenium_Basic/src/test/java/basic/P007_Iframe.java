package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P007_Iframe {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement iFrame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iFrame);
		Thread.sleep(3000);
		
		String sen = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(sen);
		
		
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		Thread.sleep(3000);
		
		
		WebElement iFrame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(iFrame2);
		Thread.sleep(3000);
		
		String sen1= driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(sen1);
	}
}
