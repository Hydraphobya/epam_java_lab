package test.epam.second.testLogger;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestsRunner extends BlockJUnit4ClassRunner {

	private TestsRunListner runListner;
	public TestsRunner(Class<TestsRunListner> clazz) throws InitializationError{
		super(clazz);
		runListner = new TestsRunListner();
	}

	public void run(RunNotifier notifier){
		notifier.addListener(runListner);
		super.run(notifier);
	}

}
