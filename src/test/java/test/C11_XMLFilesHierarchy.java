package test;

import org.testng.annotations.*;

public class C11_XMLFilesHierarchy {
    /*
    3 sekilde testng xml olusturulur
    1- hangi classlari kosturmak istiyorsak o kilaslari isaretleyip sag click yapip "creat TestNG XML" e tiklayip olustururduk
    2- manuel :önce sag clik yapip file dosya acilir isim ve .xml yazip kaydediyorduk icine manuel yaziyordur
    3. selenium3_TestNG üzerine gelip sag click yapip "creat TestNG XML" e tiklayip olustururduk (bütün testleri kosturuyorduk)


     */

    @Test
    public void test1() {
        System.out.println("test case1");
    }

    @Test
    public void test2() {
        System.out.println("test case2");
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
}
