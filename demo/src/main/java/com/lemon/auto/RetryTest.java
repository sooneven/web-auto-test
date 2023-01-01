package com.lemon.auto;

import org.testng.annotations.Test;

public class RetryTest {

    @Test(retryAnalyzer = TestNgRetry.class)
    public void testLogin() {
        System.out.println("登陆测试");
    }

}
