package cn.ztt.code;

import org.testng.annotations.Test;

public class DspendTest {

    @Test
    public void test1() {
        System.out.println("这是测试1");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        System.out.println("这是测试2");
    }
}
