package Hworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class HW34_Data_provider extends TestBase {
    //Open the site: http://opencart.abstracta.us/index.php?route=account/login
//Login with that credentials
//Email: clarusway@gmail.com
//Password: 123456789
//Using the Search function do it with Data Provider for Mac, iPad and Samsung.

    @Test (dataProvider = "getData")
    public void login2(String email, String password){
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        //Login with that credentials //Email: clarusway@gmail.com //Password: 123456789
        driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
        driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"clarusway@gmail.com","123456789"},
        };
    }

    @Test (dataProvider = "getData2")
    public void seachTest(String text) {
       //Using the Search function do it with Data Provider for Mac, iPad and Samsung.
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(text);
    }

    @DataProvider
    public Object[][] getData2(){
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}
        };
    }


}
