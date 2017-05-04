//package listner;
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
///**
// * Created by Sergey_Potapov
// */
//
//public class ListenerTest implements ITestListener {
//    protected static final Logger logger = LogManager.getLogger(ListenerTest.class);
//
//    @Override
//    public void onTestStart(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onTestFailure(ITestResult iTestResult) {
//        logger.error(iTestResult.getName() + "This test is failed ");
//        BaseTest.capture(iTestResult.getName());
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onStart(ITestContext iTestContext) {
//
//    }
//
//    @Override
//    public void onFinish(ITestContext iTestContext) {
//
//    }
//}
