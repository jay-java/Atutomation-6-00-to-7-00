package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P006_WindowHandle {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("Click Here")).click();
		String currentWindow = driver.getWindowHandle();
		
		Set<String> allWin = driver.getWindowHandles();
		
		for(String w:allWin) {
			if(!w.equals(currentWindow)) {
				driver.switchTo().window(w);
				driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
			}
		}
//		driver.close();
		driver.quit();
	}
}
