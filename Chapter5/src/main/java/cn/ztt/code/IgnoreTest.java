package cn.ztt.code;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void testCase1() {
        System.out.println("这是测试1");
    }

    @Test(enabled = false)
    public void testCase2() {
        System.out.println("这是被忽略的测试2");
    }

    @Test(enabled = true)
    public void testCase3() {
        System.out.println("这是未被忽略的测试3");
    }
}
