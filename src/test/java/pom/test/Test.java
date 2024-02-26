package pom.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import page.object.GoogleSearchPage;
import page.object.faceBookLoginPage;

public class Test {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2174174\\eclipse-workspace\\NewDemoProject\\browser\\chromedriver.exe"); 
    	 driver = new ChromeDriver(); 
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@org.testng.annotations.Test(priority=0)
	public void searchOperation() {
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.search();
	}
	@org.testng.annotations.Test(priority=1)
	public void facebookOperation() {
		faceBookLoginPage page=new faceBookLoginPage(driver);
		page.faceBookOperation();
		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
