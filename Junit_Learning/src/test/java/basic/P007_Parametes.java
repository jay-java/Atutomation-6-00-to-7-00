package basic;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

@RunWith(Parameterized.class)
public class P007_Parametes {

	String email;
	String pass;

	public P007_Parametes(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}

	static WebDriver driver = null;

//	@BeforeClass
//	public static void openbrowser() {
//		String url = "https://www.facebook.com/";
//		driver = DriverConnection.getDriver(url);
//	}
	
	@Before
	public void openbrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void loginTest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(pass);
		Thread.sleep(2000);
	}

	@Parameters
	public static List<Object[]> data() {
		
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "incorrect@gmail.com";
		obj[0][1] = "incoreect123";
		
		obj[1][0] = "incorrect@gmail.com";
		obj[1][1] = "coreect123";
		
		obj[2][0] = "correct@gmail.com";
		obj[2][1] = "incorrect123";
		
		obj[3][0] = "correct@gmail.com";
		obj[3][1] = "correct123";
		
		return Arrays.asList(obj);
	}
}
