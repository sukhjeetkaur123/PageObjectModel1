/**
 * 
 */
package com.myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.myPages.BasePage;
import pom.myPages.Page;

/**
 * @author SukhjeetKaur
 *
 */
public class BaseTest {

	WebDriver driver;
	public Page page;
	
	
	@BeforeMethod
	@Parameters(value = {"browser"})
	public void setUpTest(String browser) throws InterruptedException  {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if(browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	
		try {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(6000);
		page = new BasePage(driver);
	}
		catch (Exception e) {
		     e.printStackTrace();
		}
			// TODO: handle exception
		}
	
	private void setSoTimeout() {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	
	public void exitBrowser() {
		driver.close();
	}
}
