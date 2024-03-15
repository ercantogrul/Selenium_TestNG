package Hworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HW33_DependsOnMethods {
        /*
Create tests that depend on each other
Create beforeClass and set up settings.
By creating interdependent tests;
First go to Facebook.
Then go to Google depending on Facebook,
Then go to Amazon depending on Google
Close the driver.
 */

        WebDriver driver = new ChromeDriver();
    @Test
    public void facebook(){
        driver.get("https:www.facebook.com");
    }

    @Test (dependsOnMethods = {"facebook"}) // facebook testi gectikten sonra google testi yapilacak
    public void google(){
        driver.get("https:www.google.com");
    }

    @Test (dependsOnMethods = {"google"}) // google testi gectikten sonra amazon testi yapilacak
    public void amazon(){
        driver.get("https:www.google.com");
        driver.quit();
    }


}
