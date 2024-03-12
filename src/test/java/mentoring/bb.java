package mentoring;

import org.testng.annotations.Test;

public class bb {

    @Test
    public void test1(){System.out.println("login tested successfully");}

    @Test (dependsOnMethods = {"test1"})
    public void test2(){System.out.println("homepage tested successfully");}

    @Test
    public void test3(){
        System.out.println("smoke tests were done successfully");
    }
    @Test (priority = -1)
    public void test4(){
        System.out.println("smoke tests were done successfully");
    }


}

