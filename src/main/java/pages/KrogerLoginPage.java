package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.BrowserFactory;

public class KrogerLoginPage {

	 WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[7]/div/div/div[6]/div/div/div[2]/div/div/div[1]/div/svg/path")
	static WebElement dropdown;
	
	public  void dropDownTest(String visibleTest) {
		
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(visibleTest);
		
	}
	public KrogerLoginPage(WebDriver driver) {
		this.driver = driver;
	}
}
