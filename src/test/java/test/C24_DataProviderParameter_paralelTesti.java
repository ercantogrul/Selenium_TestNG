package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;


public class C24_DataProviderParameter_paralelTesti {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ‘’Invalid credentials’’ is displayed.

    @Test(dataProvider = "getData", invocationCount = 2) // [invocationCount = 2] bu tessti kac defa tekrarlayacagimizi veriri
    public void test(String username, String password){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement invalidWE = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        Assert.assertTrue(invalidWE.isDisplayed());

        //System.out.println(username+" "+password);
    }

    @DataProvider(parallel = true)  //(parallel = true) yazarak bu 5 farkli username ve password u paralel kosturduk
    public Object[][] getData(){
        return new Object[][]{
                {"admin*","admin123"},
                {"admin12","123"},
                {"Admin1","***00**"},
                {"test","123"},
                {"user","369"}
        };
    }
}
