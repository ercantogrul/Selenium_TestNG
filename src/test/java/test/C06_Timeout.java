package test;

import org.testng.annotations.Test;

public class C06_Timeout {
    // time out bir methodun max calisma suresini set eder
    // time out suresi asilirsa nerde kalindiysa orada test exception firlatarak methoddan cikilir

    @Test(timeOut = 400)
    void test1() throws InterruptedException {
        System.out.println("test basliyor");
        Thread.sleep(300);
        System.out.println("test bitti,test passed, test timed out");
    }


    @Test(timeOut = 400)
    void test2() throws InterruptedException {
        System.out.println("test basliyor");
        Thread.sleep(500); //ThreadTimeoutException verdi
        System.out.println("test bitti,test failed, test timed out");
    }
}
/*
timeOut özelliği, belirli bir testin maksimum ne kadar sürede tamamlanması gerektiğini belirtir.
Eğer test belirtilen süre içinde tamamlanmazsa, TestNG bu testi otomatik olarak başarısız olarak işaretler.

Bu özellik, özellikle testlerin belirli bir süre içinde tamamlanması gerektiği durumlarda faydalıdır ve testlerin
zaman aşımına uğramasını önler. Bu özellik sayesinde testlerinizin performansını da değerlendirebilirsiniz.
 */
