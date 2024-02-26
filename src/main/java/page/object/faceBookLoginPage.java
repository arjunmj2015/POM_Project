package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class faceBookLoginPage {
	WebDriver driver;
	public faceBookLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By face_link=By.xpath("//a[@jsname='UWckNb']/h3[contains(text(),'Facebook - log in or sign up')]");

	public void faceBookOperation() {
		driver.findElement(face_link).click();
	}
	

	
}
