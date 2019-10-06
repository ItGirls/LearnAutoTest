package cn.ztt.code;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void testCase1() {
        Assert.assertEquals(2L, 2L);
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testCase3() {
        Assert.assertEquals("aaa","aaa");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void logDemo() {
        Reporter.log("这是我自己的日志");
        throw new RuntimeException("这是我的运行时异常");
    }
}
