package extent_report;

import java.awt.List;
import java.io.File;
import java.util.Map;

import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.IReporter;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.Report;
import com.relevantcodes.extentreports.model.Test;

public class Externt_report<extent, Extent> implements IReporter  {
	private ExtentReports extent;
	public void generateReport(List<XmlSuite>
	xmlSuites, List<ISuite> suites, String outputDirectory) {
		extent = new ExtentReports(outputDirectory+ File
				.separator+"Extent.html",true);

		for(ISuite suite : suites) {
			Map<String,ISuiteResult> result = suite.getResults();

			for(ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();
				buidTestNodes(context.getPassedTests(),LogStatus,PASS);
				buidTestNodes(context.getFailedTests(),LogStatus,FAIL);
				buidTestNodes(context.getSkippedTests(),LogStatus,SKIP);

			}
		}
		extent.flush();
		extent.close();
	}
	private void buildTestNodes(IResultMap tests,LogStatus status) {
		Extent test;
		if(tests.size()>0) {
			for(ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());
				test.setStartedTime(getTime(result.getStartMillis()));
				test.setStartedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);
				if(result.getThrowable() != null) {
					test.log(status, result.getThrowable());}
				else
				{
					test.log(status, "Test" + status.toString().toLowerCase())
					+ "ed");

				}
				extent.endTest(test);
			}
		}
	}
	private date getTime(long millis) {
		Calender calender = Calender.getInstance();
		calender.setTimeInMillis(millis);
		return calender.getTime();
	}
	@Override
	public void addTest(Test arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}
	@Override
	public void setTestRunnerLogs() {
		// TODO Auto-generated method stub

	}
	@Override
	public void start(Report arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}
	public void start(Report report) {
		// TODO Auto-generated method stub

	}
	public void start(Report report) {
		// TODO Auto-generated method stub
		
	}
	public void start(Report report) {
		// TODO Auto-generated method stub
		
	}
}