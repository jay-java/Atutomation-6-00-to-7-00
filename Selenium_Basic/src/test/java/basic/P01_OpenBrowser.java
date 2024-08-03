package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P01_OpenBrowser {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		
		//1.Chromer driver
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jay-pc\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
		
		//2.Edge Driver
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jay-pc\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
		
		//3.Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jay-pc\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selenium@123");
	}
}
