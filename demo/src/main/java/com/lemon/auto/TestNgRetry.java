package com.lemon.auto;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNgRetry implements IRetryAnalyzer {

    private int maxRetryCount = 2;

    public static int retryCount = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount <= maxRetryCount) {
            retryCount = getRetryCount();
            System.out.println("start to " + retryCount + " retry" + iTestResult.getName());
            retryCount++;
            return true;
        }
        return false;
    }

    private int getRetryCount() {
        return retryCount;
    }
}
