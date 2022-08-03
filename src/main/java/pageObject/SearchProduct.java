package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.SearchProductUI;

public class SearchProduct {
	
	WebDriver driver;
	Helper help = new Helper();
	SearchProductUI sfp = new SearchProductUI();
	
	public SearchProduct(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickonsearch() {
		help.click(SearchProductUI.cancel);
		help.sendkeys(sfp.enter, "Liquid"+Keys.ENTER);
	}
	
}
