package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenersTestNG implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Method  " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method  " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Method  " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage  " + result.getName());
    }
}
