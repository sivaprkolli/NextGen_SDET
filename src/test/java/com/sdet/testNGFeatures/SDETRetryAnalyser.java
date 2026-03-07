package com.sdet.testNGFeatures;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class SDETRetryAnalyser implements IRetryAnalyzer {
    int retryCount = 0, maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount){
            retryCount ++;
            return true;
        }
        return false;
    }
}
