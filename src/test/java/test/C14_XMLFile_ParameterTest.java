package test;

import org.openqa.selenium.*;
import utilities.ReusableMethods;
import utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C14_XMLFile_ParameterTest extends TestBase {
    //Go to URL: https://www.amazon.com
    //Search words: Java, Selenium
    //Assert get text result test that the result text contains the searched Word.
    //Run tests from XML file.

    @Test
    public void test1() throws InterruptedException {
        //Go to URL: https://www.amazon.com
        driver.get("https://www.amazon.com");
        ReusableMethods.amazonCaptcha(driver);

        //Search words: Java
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("java"+Keys.ENTER);

        //Assert get text result test that the result text contains the searched Word.
        WebElement searchResult = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(searchResult.getText().contains("java"));

        //Search words: Selenium
        driver.navigate().back();
        WebElement searchBox2 = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox2.sendKeys("selenium"+Keys.ENTER);

        //Assert get text result test that the result text contains the searched Word.
        WebElement searchResult2 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(searchResult2.getText().contains("selenium"));

        //Run tests from XML file.

        //burada tek tek test yapiliyor ama asagida ise @Parameters ("arananKelime") ile bir method gibi
    }
    @Test  //C14_XMLFile_ParameterTest üzerinden calisma yapildi
    @Parameters ("arananKelime")
    public void test2(String keyword) throws InterruptedException {
        //Go to URL: https://www.amazon.com
        driver.get("https://www.amazon.com");
        ReusableMethods.amazonCaptcha(driver);

        //Search words: java
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(keyword+Keys.ENTER);

        //Assert get text result test that the result text contains the searched Word.
        WebElement searchResult = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(searchResult.getText().contains(keyword));


    }


}
