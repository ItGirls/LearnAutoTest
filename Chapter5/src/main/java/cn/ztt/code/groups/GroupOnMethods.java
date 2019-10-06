package cn.ztt.code.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethods {

    @Test(groups = "client")
    public void test1OnClient() {
        System.out.println("客户端测试1");
    }

    @Test(groups = "client")
    public void test2OnClient() {
        System.out.println("客户端测试2");
    }

    @Test(groups = "server")
    public void test1OnSever() {
        System.out.println("服务端测试1");
    }

    @Test(groups = "server")
    public void test2OnSever() {
        System.out.println("服务端测试2");
    }

    @BeforeGroups("server")
    public void beforeSever() {
        System.out.println("服务端组测试前beforeGroups");
    }

    @AfterGroups("server")
    public void afterSever() {
        System.out.println("服务端组测试后afterGroups");
    }

    @BeforeGroups("client")
    public void beforeClient() {
        System.out.println("客户组测试前beforeGroups");
    }

    @AfterGroups("client")
    public void afterClient() {
        System.out.println("客户端组测试后afterGroups");
    }
}
