package pageObject;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.LiveChatUI;

public class LiveChat {
	WebDriver driver;
	Helper help = new Helper();
	LiveChatUI lc = new LiveChatUI();
	
	public LiveChat(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonlivechat() {
		help.click(lc.live);
	}
	
	public void cancel() {
		help.click(LiveChatUI.cancel);
	}
	
	public void read() throws InterruptedException {
		help.click(lc.read);
		Thread.sleep(5000);
	}
	
	

}
