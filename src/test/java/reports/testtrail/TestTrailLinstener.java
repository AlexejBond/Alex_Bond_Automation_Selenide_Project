package reports.testtrail;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static org.testng.Reporter.log;

public class TestTrailLinstener implements ITestListener {
    private static final Logger LOGGER = LogManager.getLogger(TestTrailLinstener.class);

    @Override
    public void onTestFailure(ITestResult result) {
        LOGGER.info("Test Failure" + result.getStatus());
        TestTrailReporter.reportResult("2356", result.getMethod().getDescription(), new Result(5));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOGGER.info("Test Success" + result.getStatus());
        TestTrailReporter.reportResult("2356", result.getMethod().getDescription(), new Result(1));

    }
}