package reusableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;

import utility.ExtentRep;
import utility.Log4j;

public class Base {
	
	Log4j log = new Log4j();
	ExtentRep rep = new ExtentRep();
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static ExtentReports extent;
	public static Logger logg;
	public WebDriver getconect() throws IOException {
		logg = log.logger();
		extent = rep.report();
		prop = new Properties();
		fis = new FileInputStream("./src/main/java/reusableComponents/reusable.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		return driver;
	}
	
	
}
