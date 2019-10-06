package cn.ztt.code.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass1 {

    public void teacher1() {
        System.out.println("这是class1中的teacher1");
    }

    public void teacher2() {
        System.out.println("这是class1中的teacher2");
    }
}
