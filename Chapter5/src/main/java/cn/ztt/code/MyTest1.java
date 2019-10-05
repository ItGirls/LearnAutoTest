package cn.ztt.code;

import org.testng.annotations.Test;

public class MyTest1 extends BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("这是最基本的注解，标注方法为测试");
    }

    @Test
    public void testCase2() {
        System.out.println("这是测试2");
    }
}
