package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	
	@Test(priority=1, groups = "Title")
	public void testTitle() {
		String title = driver.getTitle();
		//System.out.println(title);
		System.out.println("test for title");
		Assert.assertEquals(title,"Google");
		
	}
	
	@Test(priority=2, groups = "logo")
	public void logoTest() {
		
		boolean logoDisplay = driver.findElement(By.className("lnXdpd")).isDisplayed();
		System.out.println("test for logo");
		System.out.println(logoDisplay);
		Assert.assertTrue(logoDisplay);
		Assert.assertFalse(logoDisplay);
		
	}
	
	@Test(priority=3, groups = "test")
	public void test3() {
		System.out.println("This is priority 3 test");
		
	}
	
	@Test(priority=4, groups = "test")
	public void test4() {
		System.out.println("This is priority 4 test");
		
	}
	
	@Test(priority=5, groups = "test")
	public void test5() {
		System.out.println("This is priority 5 test");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
