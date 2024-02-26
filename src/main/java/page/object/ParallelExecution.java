package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelExecution {
	    @Parameters({"username","password"})
	    @Test    
	    public void executSessionOne(String username,String password){
	            //First session of WebDriver
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\2174174\\eclipse-workspace\\POMproject\\browsers\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	            driver.get("http://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys(username);
	            driver.findElement(By.name("password")).sendKeys(password);
	            driver.findElement(By.name("btnLogin")).click();
	            
	        }
}
