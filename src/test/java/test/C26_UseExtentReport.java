package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.TestBaseExtentReport;

import static org.testng.Assert.assertEquals;

public class C26_UseExtentReport extends TestBaseExtentReport {
    //go to url google.com
    //search baklava

    @Test
    public void extendReportTest01() {
        //extentTest objesini burada atıyoruz, TestbaseReport classında ataması yapılmamıştı.
        extentTest = extentReports.createTest("ilk testimiz", "google search for baklava");

        extentTest.info("go to url google.com");
        driver.get("https://www.google.com/");
        extentTest.pass("google sayfası açıldı.");

        extentTest.info("baklava aratıyoruz");
        driver.findElement(By.id("APjFqb")).sendKeys("baklava"+ Keys.ENTER);

        //logged as passed
        extentTest.pass("baklava arandı");

        //logged as failed
        //extentTest.fail("baklava aranamadi");

        //logged as skipped
        //extentTest.skip("test ignore edildi");

        extentReports.flush();
    }
    @Test
    public void extendReportTest02() {
        //Go to linkedIn
        extentTest = extentReports.createTest("LinkedIn Test", "Navigate method");

        extentTest.info("Anasayfaya gidiliyor");
        driver.get("https://linkedin.com");
        extentTest.pass("Anasayfaya gidildi");

        //Click on Sign In
        driver.findElement(By.partialLinkText("Oturum aç")).click();
        extentTest.pass("Sign in tıklandı");

        //Nagigate back
        driver.navigate().back();
        extentTest.pass("Sayfaya geri dönüldü");

        extentReports.flush();
    }

    @Test
    public void extentReportTest03() throws InterruptedException {

        extentTest = extentReports.createTest("Contact List Test", "ABC");

        // Go to https://thinking-tester-contact-list.herokuapp.com/
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        extentTest.pass("Go to https://thinking-tester-contact-list.herokuapp.com/");

        //Enter email as clarusway@hotmail.com
        driver.findElement(By.id("email")).sendKeys("clarusway@hotmail.com");
        extentTest.pass("Enter email as clarusway@hotmail.com");

        //Enter password as Clarusway.123
        driver.findElement(By.id("password")).sendKeys("Clarusway.123");
        extentTest.pass("Enter password as Clarusway.123");

        //Click on Submit
        driver.findElement(By.id("submit")).click();
        extentTest.pass("Click on Submit");

        //Assert header is Contact List
        Thread.sleep(2000);
        String header = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Contact List", header);
        extentTest.pass("Assert header is Contact List");

        extentReports.flush();

    }
}
