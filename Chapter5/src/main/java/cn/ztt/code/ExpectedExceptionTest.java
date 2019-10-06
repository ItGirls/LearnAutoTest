package cn.ztt.code;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionTest() {
        System.out.println("这是我自己的运行时异常");
        throw new RuntimeException();
    }
}
