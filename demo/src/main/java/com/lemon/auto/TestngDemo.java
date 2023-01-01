package com.lemon.auto;

import org.testng.annotations.*;

public class TestngDemo {

    @DataProvider
    public Object[][] dp() {
        Object[][] datas = {{"jack", "123"}, {"rose", "456"}};
        return datas;
    }

    @Test(dataProvider = "dp")
    public void f(String username, String pwd) {
        System.out.println(username + " " + pwd);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

    @Test
    public void f1() {
        System.out.println("测试方法1");
    }

    @Test
    public void f2() {
        System.out.println("测试方法2");
    }

    @Test
    public void f3() {
        System.out.println("测试方法3");
    }
}
