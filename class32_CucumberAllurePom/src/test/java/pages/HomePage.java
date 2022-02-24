package pages;

import org.openqa.selenium.By;
import base.Base;

public class HomePage extends Base{
//	WebDriver driver;
//	HomePage(WebDriver driver) {
//		this.driver=driver;
//	}
	By welcomeText=By.xpath("//div//h2[text()='Welcome Test ']");
	
	public String getWelcomeText() {
		return browser.findElement(welcomeText).getText();
	}
	
}
