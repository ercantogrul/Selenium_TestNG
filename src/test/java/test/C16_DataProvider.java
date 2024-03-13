package test;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C16_DataProvider extends TestBase {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ‘’Invalid credentials’’ is displayed.

    @Test(dataProvider = "getData")
    public void test(String username, String password){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement invalidWE = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        Assert.assertTrue(invalidWE.isDisplayed());
    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"java","Pass123"},
                {"javascript","password*"},
                {"pyhton","pass***"},
                {"admin","admin***"},
                {"admin*","pass123456"},
        };
    }

}
