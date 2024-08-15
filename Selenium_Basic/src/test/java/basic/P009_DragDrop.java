package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class P009_DragDrop {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = DriverConnection.getDriver(url);
		//div[@rel-title='Photo Manager']
		
		WebElement iFrame = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(iFrame);
		Thread.sleep(2000);
		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement to = driver.findElement(By.id("trash"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(img1).moveToElement(to).release().build().perform();
		
	}
}
