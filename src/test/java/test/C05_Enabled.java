package test;

import org.testng.annotations.Test;

public class C05_Enabled {
    //  enabled = false  methodu : Testi gormezden gelmek icin @Test in yanina
    //  (enabled = false) fonksiyonunu kullaniriz.
    // default deger true dur yazmaya gerek yoktur.

    // enabled = false olursa testimiz pasif hale gelir ve calismaz

    @Test
    void test1(){System.out.println("test1");}

    @Test
    void test2(){System.out.println("test2");}

    @Test(enabled = false)
    void test3(){System.out.println("test3");}

    @Test
    void test4(){System.out.println("test4");}

    @Test (enabled = false)
    void test5(){System.out.println("test5");}

    @Test
    void test6(){System.out.println("test6");}
    //////

    @Test(priority = 3000)
    void b(){
        System.out.println("b");
    }

    @Test(priority = -2001,dependsOnMethods = {"test6","c"})  // önce "dependsOnMethods = {"test6","c"" bu kosul saglandiktan sonra
    //(test6","c") bu iki test kosulduktan sonra "b" ve "a"  testleri kosulur. "dependsOnMethods = {"test6","c"" bu kosul önce saglandigi icin a ve b testlerinin öncelik sirasina bakilir.
    void a(){
        System.out.println("a");
    }

    @Test
    void c(){
        System.out.println("c");
    }
}
/*
c
test1
test2
test4
test6
a
b
 */