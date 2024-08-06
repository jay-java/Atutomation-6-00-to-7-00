package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P003_StaticTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[2]/span"));
		String name= data.getText();
		System.out.println(name);
	}
}
