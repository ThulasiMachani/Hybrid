package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRep {
	
	ExtentReports report;
	
public ExtentReports report() {
		
		report = new ExtentReports();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		String stamp = sdf.format(d);
		ExtentSparkReporter spark = new ExtentSparkReporter(new File("./reports/report "+stamp+".html"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Thulasi Machani");
		report.attachReporter(spark);
		return report;
		
		
		
		
		
		
	}

}
