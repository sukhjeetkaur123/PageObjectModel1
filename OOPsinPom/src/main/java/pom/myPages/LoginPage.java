/**
 * 
 */
package pom.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author SukhjeetKaur
 *
 */
public class LoginPage extends BasePage {
	
//	 page locators:
	
	private By userName = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By loginButton = By.id("btnLogin");
	private By header = By.id("divLogo");
	

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//	 getter method by sukhjeet by encapsulation

	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return getElement(userName);
	}


	
	

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}


	

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}



	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

 
	public HomePage doLogin(String userName,String password) {
	      
		getUserName().sendKeys(userName);
		getPassword().sendKeys(password);
		getLoginButton().click();
		
		
		return getInstance(HomePage.class);
	}
	
//1	 want to overload with negative test cases 
	public HomePage doLogin() {
		getUserName().sendKeys("hgfdf");
		getPassword().sendKeys("jhgf");
		getLoginButton().click();
		
		
		return getInstance(HomePage.class);
	}	
// 2    
	public HomePage doLogin1(String userName) {
	getUserName().sendKeys("userName");
	getPassword().sendKeys(" ");
	getLoginButton().click();
	
	
	return getInstance(HomePage.class);
}
	
	public void doLogin(String userCred) {
		if(userCred.contains("username")) {
			getUserName().sendKeys(userCred.split(":")[1].trim());
		}
		else if (userCred.contains("password")) {
			getUserName().sendKeys(userCred.split(":")[1].trim());
		}
			getLoginButton();
		
	}	
		
		
	
	

}
