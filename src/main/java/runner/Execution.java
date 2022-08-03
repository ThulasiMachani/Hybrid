package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageObject.BounceLogo;
import pageObject.ContactUs;
import pageObject.FabricCare;
import pageObject.LiveChat;
import pageObject.MachineCare;
import pageObject.PGLogo;
import pageObject.Powder;
import pageObject.SearchProduct;
import pageObject.StrainRemover;
import pageObject.WhatsNew;
import reusableComponents.Base;

public class Execution extends Base {

	@BeforeMethod
	public void initialization() throws IOException, InterruptedException {
		driver = getconect();
		logg.info("browser initialization");
		ExtentTest report = extent.createTest("browser initialization");
		driver.get(prop.getProperty("url"));
		report.pass("url fetched");
		LiveChat LC = new LiveChat(driver);
		Thread.sleep(9000);
		LC.cancel();
		Powder pr = new Powder(driver);
		Thread.sleep(2000);

	}

	@Test(priority = 1)
	public void livechat() throws InterruptedException {
		LiveChat LC = new LiveChat(driver);
		ExtentTest test1 = extent.createTest("verifying Live chat");
		test1.pass("Live chat verified");
		logg.info("Live chat verified");
		LC.clickonlivechat();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void powder() {
		Powder pr = new Powder(driver);
		ExtentTest test2 = extent.createTest("verifying Powder feature");
		test2.pass("clicked on powder");
		logg.info("clicked on powder");
		pr.clickonpowder();
	}

	@Test(priority = 3)
	public void search() {
		SearchProduct sp = new SearchProduct(driver);
		ExtentTest test3 = extent.createTest("verifying search feature");
		test3.pass("clicked on search");
		logg.info("clicked on search");
		sp.clickonsearch();
	}

	@Test(priority = 4)
	public void strain() {
		StrainRemover sr = new StrainRemover(driver);
		ExtentTest test4 = extent.createTest("verification of strain remover");
		test4.pass("clicked on strain remover");
		logg.info("clicked on strain remover");
		sr.clickonstrainremover();
	}

	@Test(priority = 5)
	public void bounce() {
		BounceLogo br = new BounceLogo(driver);
		ExtentTest test5 = extent.createTest("verification of Bounce Logo");
		test5.pass("clicked on Bounce logo");
		logg.info("clicked on Bounce logo");
		br.clickonlogo();
	}

	@Test(priority = 6)
	public void contact() {
		ContactUs c = new ContactUs(driver);
		ExtentTest test6 = extent.createTest("verification of contact feature");
		test6.pass("clicked on contact");
		logg.info("clicked on contact");
		c.clickoncontact();
	}

	@Test(priority = 7)
	public void fabric() {
		FabricCare f = new FabricCare(driver);
		ExtentTest test7 = extent.createTest("verification of fabric feature");
		test7.pass("clicked on fabric");
		logg.info("clicked on fabric");
		f.clickonfabric();
	}

	@Test(priority = 8)
	public void machine() {
		MachineCare m = new MachineCare(driver);
		ExtentTest test8 = extent.createTest("search for machine care");
		test8.pass("searched for machine care in search bar");
		logg.info("searched for machine care in search bar");
		m.machinecare();
	}

	@Test(priority = 9)
	public void pglogo() {
		PGLogo pl = new PGLogo(driver);
		ExtentTest test9 = extent.createTest("verifying p&g logo");
		test9.pass("clicked on p&g logo");
		logg.info("clicked on p&g logo");
		pl.clickonpg();
	}

	@Test(priority = 10)
	public void what() {
		WhatsNew ws = new WhatsNew(driver);
		ExtentTest test10 = extent.createTest("verifying whatsnew feature");
		test10.pass("clicked on whatsnew");
		logg.info("clicked on whatsnew");
		ws.clickonwhatsnew();
	}

	@AfterMethod
	public void closer() {
		extent.flush();
		driver.quit();
	}

}
