/**
 * 
 */
package com.myTest;


import org.testng.annotations.Test;

import pom.myPages.HomePage;
import pom.myPages.LoginPage;

/**
 * @author SukhjeetKaur
 *
 */
public class LoginTest extends BaseTest{
 
	
//	@Test
//public void verifyLoginPageHeader() {
//		WebElement header = page.getInstance(LoginPage.class).getHeader();
//		
//	}
	@Test
	public void doLoginTest() {
	HomePage homePage=page.getInstance(LoginPage.class).doLogin("Admin", "admin123");
	}
	  @Test(priority = 0)
      public void doLoginTestWithNativeInput() {
    	  HomePage homePage=page.getInstance(LoginPage.class).doLogin();
    	  
      }
	  @Test(priority = 1)
      public void doLoginTestWithNativeInput2() {
    	  HomePage homePage=page.getInstance(LoginPage.class).doLogin1("Admin");
    	  
      }
      
}
