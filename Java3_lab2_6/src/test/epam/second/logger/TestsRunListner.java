package test.epam.second.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TestsRunListner extends RunListener {

	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}

	static Logger logger = Logger.getLogger(TestsRunListner.class.getName());
	
	@Override
	public void testStarted(Description description) throws Exception{
		logger.info("Test started:" + description.getMethodName());		
	}
	@Override
	public void testFinished(Description description) throws Exception{
		logger.info("Test finished: " + description.getMethodName());		
	}
	@Override
	public void testFailure(Failure failure) throws Exception{
		logger.info("Test failed with the exception: " + failure.getException());
	}
	@Override 
	public void testIgnored(Description description) throws Exception{
		logger.info("Test ignored: " + description.getMethodName());
	}
	@Override
	public void testRunFinished(Result result) throws Exception{
		StringBuilder resultString = new StringBuilder();
		resultString.append("Test results: \n ");
		resultString.append("execution time - " + result.getRunTime() + " ms; \n ");
		resultString.append("tests number - " + result.getRunCount() + "; \n ");
		resultString.append("failed tests number - " + result.getFailureCount() + "; \n ");
		resultString.append("ignored tests number - " + result.getIgnoreCount() + "; \n ");
		
		
		
		logger.info(resultString.toString());
		
		
	}
}
