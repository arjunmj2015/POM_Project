package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.excelUtil;

public class DataProvider {
	WebDriver driver;
	
	@org.testng.annotations.DataProvider
	public Object[][] getLoginData() {
		Object data[][]=excelUtil.getTestData("Login");
		
		return data;
	}
	@Test(dataProvider="getLoginData")
	public void login(String username,String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2174174\\eclipse-workspace\\NewDemoProject\\browser\\chromedriver.exe"); 
   	 driver = new ChromeDriver(); 
   	driver.get("https://demo.guru99.com/test/login.html");
   	driver.findElement(By.id("email")).sendKeys(username);
   	driver.findElement(By.id("passwd")).sendKeys(password);
   	driver.quit();
   	
	}
	

}
