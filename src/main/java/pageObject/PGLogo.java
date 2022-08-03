package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.PGLogoUI;

public class PGLogo {
	
	WebDriver driver;
	Helper help = new Helper();
	PGLogoUI pg = new PGLogoUI();
	
	public PGLogo(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonpg() {
		help.click(PGLogoUI.cancel);
		help.click(pg.pgl);
		help.click(pg.report);
	}

}
