package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.BrowserFactory;

public class KrogerHomeTest {
	WebDriver driver;
	
	@Test
	public void homeTest() {
		BrowserFactory.init();
		BrowserFactory.tearDown();
	}
}
