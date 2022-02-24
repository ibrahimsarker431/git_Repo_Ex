package pages;
import org.openqa.selenium.By;
import base.Base;

public class LandingPage extends Base{

	By Loginbtn=By.xpath("//a[@href='elogin.php']");
	
	public void navigateURL() {
		browser.get("https://sit.skyschooling.com/microtech");
	}
	
	public void click_Login_Btn() {
		browser.findElement(Loginbtn).click();
		//click(Loginbtn);
	}
	
}
