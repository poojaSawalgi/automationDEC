package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority=3)
	public void TC01() {
		System.out.println("TC01 is executed");
		}
	@Test(invocationCount=5)
	public void TC02() {
		System.out.println("TC02 is executed");
	}
	@Test(enabled=false)
	public void TC03() {
		System.out.println("TC03 is executed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Aplication login");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Aplication logout");
		}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is opened");
	}
	@AfterClass
	public void closeBrowse( ) {
		System.out.println("Brower is closed");
	}
		
	}
	
		
	
	
	
	


