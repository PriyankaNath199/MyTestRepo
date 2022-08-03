package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGBasics {
	
	//Prerequisite annotation
	
	@BeforeSuite //
	public void setup() {
		System.out.println("install chrome and configure");
	}
	
	
	@BeforeTest
	public void launchBroser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("login method");
	}
	
	
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
		
	}
	
	//Test case
	
	@Test
	public void titleTest() {
		System.out.println("Google title test");
		
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	//Post conditions
	
	@AfterMethod
	public void logOut() {
		System.out.println("logout method");
	}
	
	@AfterClass
	public void deleteCookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterSuite
	public void testReport() {
		System.out.println("generate test report");
	}

}
