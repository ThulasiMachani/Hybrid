package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.FabricCareUI;

public class FabricCare {
	WebDriver driver;
	Helper help = new Helper();
	FabricCareUI fc = new FabricCareUI();
	
	public  FabricCare(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonfabric() {
		help.click(FabricCareUI.cancel);
		help.hover(fc.shop);
		help.click(fc.fabric);
		help.click(fc.sensitive);
	}

}
