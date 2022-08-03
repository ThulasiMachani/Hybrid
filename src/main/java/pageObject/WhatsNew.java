package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.WhatsNewUI;

public class WhatsNew {
	WebDriver driver;
	Helper help = new Helper();
	WhatsNewUI wn = new WhatsNewUI();
	
	public WhatsNew(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonwhatsnew() {
		help.click(WhatsNewUI.cancel);
		help.click(wn.what);
		help.click(wn.learn);
	}

	}


