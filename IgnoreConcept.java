package com.TestNG_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreConcept {
	@BeforeSuite
	private void method() {
		System.out.println("setProperty");

	}
	@BeforeTest
	private void method1() {
		System.out.println("launchUrl");
	}
	@BeforeClass
	private void method2() {
		System.out.println("launchchrome");

	}
	@BeforeMethod
	private void method3() {
		System.out.println("login");

	}
	@Test(groups = "studies")
	private void books() {
		System.out.println("books");

	}
	@Test(timeOut = 4000,groups = "electronics")
	private void mobile() throws InterruptedException {
		System.out.println("mobiles");
		Thread.sleep(2000);
		System.out.println("huawei");
	}
	@Test(expectedExceptions = NullPointerException.class)
	private void laptop() {
		int a = (Integer) null;
		System.out.println(a);

	}
	@Test(groups = "studies")
	private void bags() {
		System.out.println("Bags");

	}
	@Test(groups = "electronics")
	private void earphones() {
		System.out.println("earphones");

	}
	@AfterMethod
	private void met() {
		System.out.println("logout");
		

	}
	@AfterClass
	private void aftclass() {
		System.out.println("deletecookies");

	}
	@AfterTest
	private void aftest() {
		System.out.println("close");

	}
	@AfterSuite
	private void aftsuite() {
		System.out.println("quit");

	}
}
