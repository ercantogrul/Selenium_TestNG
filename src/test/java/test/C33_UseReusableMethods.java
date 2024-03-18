package test;

import org.testng.annotations.Test;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBase;

import static utilities.JSUtils.scrollAllUpByJS;

public class C33_UseReusableMethods extends TestBase {
    JSUtils js = new JSUtils();
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        js.scrollDownByJS(driver);
        Thread.sleep(2000);
        scrollAllUpByJS(driver);

    }

}
