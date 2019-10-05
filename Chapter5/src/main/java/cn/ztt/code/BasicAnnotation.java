package cn.ztt.code;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {

    @BeforeMethod(enabled = true)
    public void beforeMethod() {
        System.out.println("这是在测试方法之前运行的beforeMethod");
    }

    @AfterMethod(enabled = true)
    public void afterMethod() {
        System.out.println("这是在测试方法之后运行的afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("这是beforeClass");
    }

    @AfterClass
    public void afterClass() {
         System.out.println("这是afterClass");
    }

    @BeforeTest(enabled = true)
    public void beforeTest() {
        System.out.println("这是beforeTest");

    }
    @AfterTest(enabled = true)
    public void afterTest() {
        System.out.println("这是afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("这是beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("这是afterSuite");
    }
}
