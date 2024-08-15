package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class P008_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement miniTV = driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bs = driver.findElement(By.linkText("Best Sellers"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(miniTV).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(sell).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(bs).build().perform();
		Thread.sleep(1000);
		
		bs.click();
	}
}
