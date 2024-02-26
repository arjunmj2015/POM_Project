package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	

	public GoogleSearchPage(WebDriver driver) {
		
		this.driver = driver;
	}
	By SearchBox =By.name("q");
	By SearchBtn=By.xpath("//*[@id=\"jZ2SBf\"]/div[1]");
	public void search() {
		driver.findElement(SearchBox).sendKeys("Face book");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(SearchBtn).click();
	}
	
}
	
