package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.ContactUsUI;

public class ContactUs {
	WebDriver driver;
	Helper help = new Helper();
	ContactUsUI cu = new ContactUsUI();
	
	public ContactUs(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickoncontact() {
		help.click(ContactUsUI.cancel);
		help.click(cu.contact);
		help.click(cu.where);
	}

}
