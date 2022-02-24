package pages;

import org.openqa.selenium.By;
import base.Base;

public class EmployeeLoginPage extends Base {
//	WebDriver driver;
//	public EmployeeLoginPage(WebDriver driver) {
//		this.driver=driver;
//	}
	By employeeLoginLabel = By.xpath("//h1[text()='Employee Login ']");	
	By userIdBox=By.name("mailuid");
    By userPasswordBox=By.name("pwd");
    By loginBtn=By.name("login-submit");
    
    public String getEmployeeLoginLabel() {
    	return browser.findElement(employeeLoginLabel).getText();
    }
    
    public void enterUserId(String userId) {
    	browser.findElement(userIdBox).sendKeys(userId);
    }
    public void enterUserPassword(String password) {
    	browser.findElement(userPasswordBox).sendKeys(password);
    }
    public void clickLoginBtn() {
    	browser.findElement(loginBtn).click();
    }
	
}
