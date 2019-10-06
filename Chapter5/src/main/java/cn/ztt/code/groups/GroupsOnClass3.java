package cn.ztt.code.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass3 {
    public void stu1() {
        System.out.println("class3中的stu111");
    }

    public void stu2() {
        System.out.println("class3中的stu222");
    }

    public void stu3() {
        System.out.println("class3中的stu333");
    }
}

