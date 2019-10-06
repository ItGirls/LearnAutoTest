package cn.ztt.code.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider ="data")
    public void testDataProvider(String name, int age) {
        System.out.println("name = "+name+" ,age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {
                        "wangwu", 18
                },
                {
                        "zhangsan", 20
                },
                {
                        "lisi", 22
                }
        };

        return o;
    }
}
