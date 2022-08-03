package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.MachineCareUI;

public class MachineCare {
	WebDriver driver;
	Helper help = new Helper();
	MachineCareUI mc = new MachineCareUI();
	
	
	public MachineCare(WebDriver driver) {
		this.driver=driver;
	}
	
	public void machinecare() {
		help.click(MachineCareUI.cancel);
		help.sendkeys(mc.search, "Machine Care"+Keys.ENTER);
		help.click(mc.retail);
	}

}
