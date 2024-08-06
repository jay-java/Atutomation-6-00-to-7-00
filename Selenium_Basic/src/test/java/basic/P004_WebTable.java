package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P004_WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
		System.out.println("--------------------------------");
		for (int i = 1; i <= 3; i++) {
			WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[" + i + "]/span"));
			String heading = data.getText();
			System.out.print(heading + " | ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= 3; j++) {
				WebElement data = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]/span"));
				String text = data.getText();
				System.out.print(text + " | ");
			}
			System.out.println();
			System.out.println("--------------------------------");
		}
		System.out.println("--------------------------------");
	}
}
