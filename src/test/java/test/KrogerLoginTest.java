package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.KrogerLoginPage;
import util.BrowserFactory;

public class KrogerLoginTest {
WebDriver driver;
	
	@Test
	public void homeTest() {
		
		driver = BrowserFactory.init();
		KrogerLoginPage page = PageFactory.initElements(driver, KrogerLoginPage.class);
		page.dropDownTest("Sign in");
		
		BrowserFactory.tearDown();
}
}