package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C10_SoftAssertion extends TestBase {
    //Test Case2: Negative Username Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username incorrectUser into Username field.
    //Type password Password123 into Password field.
    //Click Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your username is invalid!

    @Test
    public void negativeUserNameTestSoft(){
        SoftAssert sa = new SoftAssert();
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username incorrectUser into Username field.
        driver.findElement(By.cssSelector("input#username")).sendKeys("incorrectUser");

        //Type password Password123 into Password field.
        driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");

        //Click Submit button.
        driver.findElement(By.cssSelector("button#submit")).click();

        //Verify error message is displayed.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div#error"))));
        sa.assertTrue(driver.findElement(By.cssSelector("div#error")).isDisplayed());

        //Verify error message text is Your username is invalid!
        sa.assertEquals(driver.findElement(By.cssSelector("div#error")).getText(), "Your username is invalid!");

        sa.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin

    }
}
