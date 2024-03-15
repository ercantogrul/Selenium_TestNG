package mentoring;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;

public class T6_C18_Parameter extends TestBase {
    //Goto Page: https://testpages.eviltester.com/styled/validation/input-validation.html
//Use parameter with testNg xml (3 times different parameter)

//    @Test
//    @Parameters({"isim","soyad","yas"})   // birden fazla parametre varsa {} parantezine alinir
//    public void test1(String name, String surname, String age){
//        System.out.println(name+" "+surname+" "+age);
//    }
    @Test()
    @Parameters({"name", "lastname","age"})
    public void test2(String name, String lastname, String age) {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastname);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.xpath("//input[@type='submit']")).click();


    }


}
