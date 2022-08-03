package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.BounceLogoUI;

public class BounceLogo {
	WebDriver driver;
	Helper help = new Helper();
	BounceLogoUI bl = new BounceLogoUI();
	
	public BounceLogo(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonlogo() {
		help.click(BounceLogoUI.cancel);
		help.click(bl.logo);
		help.click(bl.drying);
	}

}
