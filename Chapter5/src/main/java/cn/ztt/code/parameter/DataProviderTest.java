package cn.ztt.code.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

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

    @Test(dataProvider = "methodDataProvider")
    public void testCase1(String name, int age) {
        System.out.println("name = "+name+", age="+age);
    }

    @Test(dataProvider = "methodDataProvider")
    public void testCase2(String name, int age) {
        System.out.println("name = "+name+", age="+age);
    }

    @DataProvider(name = "methodDataProvider")
    public Object[][] providerData1(Method method) {
        Object[][] result = null;
        if (method.getName().equals("testCase1")) {
            result = new Object[][]{
                    {"zhangsan",13}
            };
        } else if (method.getName().equals("testCase2")) {
            result = new Object[][]{
                    {"lisi",14},
                    {"wangwu",15}
            };
        }
        return result;
    }

}
