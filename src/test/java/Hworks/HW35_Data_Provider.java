package Hworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;


public class HW35_Data_Provider extends TestBase {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
//Login with negative credentilas by Data Provider.
//Then assert that ''Invalid credentials'’ is displayed.

    @Test(dataProvider = "getdata")
    public void test(String email, String password) {
        //Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Login with negative credentilas by Data Provider.
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        //Then assert that ''Invalid credentials'’ is displayed.
        WebElement verify = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        Assert.assertTrue(verify.getText().equals("Invalid credentials"));
    }

    @DataProvider
    public static Object[][] getdata() {
        return new Object[][]{
                {"admin2", "admin321"}
        };
    }



}
