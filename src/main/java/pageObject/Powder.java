package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.PowderUI;

public class Powder {
	WebDriver driver;
	Helper help = new Helper();
	PowderUI pr = new PowderUI();
	
	public Powder(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonpowder() {
		help.click(PowderUI.cancel);
		help.hover(pr.shop);
		help.click(pr.pow);
	}

}
