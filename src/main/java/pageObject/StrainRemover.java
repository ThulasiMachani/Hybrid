package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.StrainRemoverUI;

public class StrainRemover {
	WebDriver driver;
	Helper help = new Helper();
	StrainRemoverUI sr = new StrainRemoverUI();
	
	public StrainRemover(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonstrainremover() {
		help.click(StrainRemoverUI.cancel);
		help.hover(sr.shop);
		help.click(sr.strain);
	}

}
