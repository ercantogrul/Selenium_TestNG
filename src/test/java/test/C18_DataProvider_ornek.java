package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.DataProviderBase;
import utilities.TestBase;

public class C18_DataProvider_ornek extends TestBase {
    //farkli bir class dan datalarimizi da alarak kullanbilirz, bunun icin data provider olan
    //methodu dogru sekilde parametre olarak test methoduna entegre etmeliyiz.

    //**************************bir excell den veri leri alip test etme************
    @Test(dataProviderClass = DataProviderBase.class,dataProvider = "firsName_LastName_age")  //DataProviderBase class dan "firsName_LastName_age" methodunu aldik
    public void test(String name, String lastname, String age) throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastname);
        driver.findElement(By.id("age")).sendKeys(age);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
    @Test(dataProviderClass = DataProviderBase.class,dataProvider = "dataName")
    public void dataProviderTest(String name){
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("age")).sendKeys("18");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test(dataProvider = "fakerData",dataProviderClass = DataProviderBase.class)
    public void dataProviderFakerTest(String lastName,String name){
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastName);
        driver.findElement(By.id("age")).sendKeys("18");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test(dataProviderClass = DataProviderBase.class,dataProvider = "dataFullName")
    public void dataProvideFullName(String name,String lastName){
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastName);
        driver.findElement(By.id("age")).sendKeys("18");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }


}