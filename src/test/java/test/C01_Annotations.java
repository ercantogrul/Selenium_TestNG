package test;

import org.testng.annotations.*;

public class C01_Annotations {
    /*
@BeforeSuite-@AfterSuite : Bu paketteki tüm testlerden önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeTest-@AfterTest :Tüm test methodlarından önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeClass-@AfterClass :Herhangi belirli test grubundan önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeGroups-@AfterGroups : Bir test sınıfındaki tüm test yöntemlerinden önce/sonra çalışır.Sadece bir kere çalışır.
@BeforeMethod-@AfterMethod :Her test methodundan önce/sonra çalışır
 */
    /*
    Create a class.
    Create 2 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.
     */
    @Test
    public void test1(){
        System.out.println("test1 çalıştı");
    }
    @Test
    public void test2(){
        System.out.println("test2 çalıştı");
    }
    @Test
    public void test3(){
        System.out.println("test2 çalıştı");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suit");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suit");
    }

        /*
    before suit
    before test
           bu araya gourup da gelebilir
    before class
        before method----
          test case1
        after method

        before method-----
          test case2
        after method-----
    after class
          bu araya gourup da gelebilir
    after test
    after suit
     */
}
