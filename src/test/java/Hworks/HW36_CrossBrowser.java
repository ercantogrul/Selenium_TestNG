package Hworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class HW36_CrossBrowser extends TestBase {
    //Go to URL: http://crossbrowsertesting.github.io/
//Click to To-Do App
//Checking Box to do-4 and Checking Box to do-5
//If both clicks worked, then the following List should be have length 2.
//Assert that this is correct
//Assert that the to do we added is present in the list
//Archiving old todos
//If our archive link worked, then the following list should have length 4.
//Assert that this is true as well
//Doing Cross Browser Testing.

    @Test
    public void test() throws InterruptedException {
        //Go to URL: http://crossbrowsertesting.github.io/
        driver.get("http://crossbrowsertesting.github.io/");

//Click to To-Do App
        WebElement clickToDo = driver.findElement(By.xpath("//a[@href='todo-app.html']"));
        clickToDo.click();

        WebElement check1 = driver.findElement(By.xpath("//input[@name='todo-4']"));
        if(!check1.isSelected()){
            check1.click();
        }
        Thread.sleep(3000);
        Assert.assertTrue(check1.isSelected());
        WebElement check2 = driver.findElement(By.xpath("(//input[@name='todo-5']"));

        if(!check2.isSelected()){
            check2.click();
        }
        Thread.sleep(3000);

        Assert.assertTrue(check2.isSelected());

//        WebElement text = driver.findElement(By.className("ng-binding"));
//        Assert.assertTrue(text.getText().contains("3 of 5 remaining [ archive ]"));







    }
}
