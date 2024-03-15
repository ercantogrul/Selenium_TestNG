package mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.ParameterBrowserTestBase;

public class T8_CrossBrowsing_2 extends ParameterBrowserTestBase {
    //Goto Page:https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
//Send title, text and click add buttton (5 times)
//CrossBrowser Test (Chrome,FireFox,Edge

    @Test
    @Parameters({"title","text"})
    public void test(String title,String text){
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");

        WebElement title1= driver.findElement(By.xpath("//input[@id='note-title-input']"));
        title1.sendKeys(title);

        WebElement text1= driver.findElement(By.xpath("//textarea[@id='note-details-input']"));
        text1.sendKeys(text);

        WebElement add= driver.findElement(By.xpath("//button[@id='add-note']"));
        add.click();


    }

}

