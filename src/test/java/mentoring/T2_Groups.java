package mentoring;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import utilities.TestBase;

public class T2_Groups extends TestBase {
    //create 6 test method
//Create 2 groups for tests name it A and B
//Give priority "-1" for the last test(6)
//6 th test dependsOn Group A
//Create @BeforeGroups and After Groups Annotations


    @Test(groups ="A")
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups ="A")
    public void test2(){
        System.out.println("test2");
    }
    @Test(groups ="A")
    public void test3(){
        System.out.println("test3");
    }
    @Test(groups ="B")
    public void test4(){
        System.out.println("test4");
    }
    @Test(groups ="B")
    public void test5(){
        System.out.println("test5");
    }
    @Test (dependsOnGroups ="A",priority = -1)
    public void test6(){
        System.out.println("test6");
    }
    @BeforeGroups (groups ={"A","B"})
    public void beforeGroups() {
        System.out.println("Before Groups");

    }
    @AfterGroups(groups ={"A","B"})
    public void afterGroups() {
        System.out.println("After Groups");
    }



}
