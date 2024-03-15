package mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class T7_CrossBrowsing_xml_yok {
    //Goto Page:https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
//Send title, text and click add buttton (5 times)
//CrossBrowser Test (Chrome,FireFox,Edge

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.id("note-title-input")).sendKeys("abc");
        driver.findElement(By.id("note-details-input")).sendKeys("xyz");
        driver.findElement(By.id("add-note")).click();}

    @Test
    public void test2(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.id("note-title-input")).sendKeys("abc");
        driver.findElement(By.id("note-details-input")).sendKeys("xyz");
        driver.findElement(By.id("add-note")).click();}

    @Test
    public void test3(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.id("note-title-input")).sendKeys("abc");
        driver.findElement(By.id("note-details-input")).sendKeys("xyz");
        driver.findElement(By.id("add-note")).click();
    }







}

