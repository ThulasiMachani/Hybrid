package reusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper extends Base {
	
	public void click(By element) {
		driver.findElement(element).click();
	}
	
	public void sendkeys(By element, String text) {
		driver.findElement(element).sendKeys(text+Keys.ENTER);
	}
	
	public void hover(By element) {
		WebElement val = driver.findElement(element);
		Actions a = new Actions(driver);
		a.moveToElement(val).perform();
	}
	
	public String isdisplayed(By element) {
		String val = driver.findElement(element).getText();
		return val;
		
	}

}
