package cn.ztt.code.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1() {
        System.out.println("class2中的stu11");
    }

    public void stu2() {
        System.out.println("class2中的stu22");
    }
}
