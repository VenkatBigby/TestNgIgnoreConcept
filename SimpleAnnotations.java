package com.TestNG_Project;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations extends Base_ClassTestNg {
	@BeforeSuite
	private void Welcome() {
		System.out.println("TestNG SimpleAnnotations");

	}

	@BeforeTest
	private void launchBrowser() {
		System.out.println("The Browser is ChromeBrowser");
		browserLaunch("chrome");

	}

	@BeforeClass
	private void getUrl() {
		System.out.println("Welcome to Amazon");
		
		getUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&", 10l);
	}

	@BeforeMethod
	private void login() {
		System.out.println("LoginCredentials");
		SimpleAnnoPom pm = new SimpleAnnoPom(driver);
		//acMovetoElement(pm.getMovelogin());
		//clickOn(pm.getSignin());
		sendKeys("8870590709", pm.getEmail());
		clickOn(pm.getClickContinue());
		sendKeys("Venky@230895", pm.getPass());
		clickOn(pm.getSigninSubmit());
	}

	@Test
	private void MobileSearch() throws AWTException {
		System.out.println("Samsung Mobile");
		
		SimpleAnnoPom pm = new SimpleAnnoPom(driver);
		sendKeys("Samsung mobile", pm.getSearchbox());
		robotEnter();

	}

	@Test
	private void laptopSearch() throws AWTException {
		System.out.println("Del Laptop");
		SimpleAnnoPom pm = new SimpleAnnoPom(driver);
		sendKeys("Del Laptop", pm.getSearchbox());
		robotEnter();

	}

	@Test
	private void EarphonesSearch() throws AWTException {
		System.out.println("Sennheiser Earphone");
		SimpleAnnoPom pm = new SimpleAnnoPom(driver);
		sendKeys("Sennheiser earphones", pm.getSearchbox());
		robotEnter();

	}

	@AfterMethod
	private void Logout() {
		System.out.println("Logout");
		SimpleAnnoPom pm = new SimpleAnnoPom(driver);
		acMovetoElement(pm.getMoveSignin());
		clickOn(pm.getSignout());

	}

	@AfterClass
	private void DeleteCookies() {
		deleteCookies();

	}
	
	@AfterTest
	private void closeUrl() {
		close();

	}

	

	@AfterSuite
	private void aftersuite() {
		quit();

	}

	
}
