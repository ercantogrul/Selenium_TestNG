package mentoring;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;

public class T6_C18_DataProvider extends TestBase {
    // Goto page: https://testpages.eviltester.com/styled/validation/input-validation.html
//Locate name and last name from xml. sheet
//(Use DataProviderBase Class get information from here)

    @Test(dataProvider = "getData")
    public void test(String firstName, String lastName) throws InterruptedException {
        Faker faker = new Faker();
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys(String.valueOf(Math.random()*100));
       // driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys(faker.number().digit());
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    @DataProvider
    public Object[][] getData() throws IOException {
        String path = "C:\\Users\\etogr\\IdeaProjects\\Selenium3_TestNG\\src\\test\\java\\resources\\Personal Info.xlsx";

        FileInputStream fis = new FileInputStream(path);  // bu dosyayi akisa aldim (akisa aldiktan sonra bir objeye cevirdik)
        Workbook wb = WorkbookFactory.create(fis);  // javanin icine hayali bir exel dosyaya aktardik

        // Open the first worksheet. (worksheet in isminden gidiyoruz ismi "Sayfa1", index "0")
        Sheet sheet1 = wb.getSheet("Sayfa1");  // worksheet e isimle ulastik

        Object[][] data = new Object[5][]; // iki boyutlu ve ici bos 5 elemanli Object bir Array olustruruldu
        for (int i = 0; i < 5; i++) {
            String name = String.valueOf(sheet1.getRow(i + 1).getCell(0));
            String surName = String.valueOf(sheet1.getRow(i + 1).getCell(1));
            data[i] = new Object[]{name, surName};
        }
        return data;
    }

    @Test(dataProvider = "getData1")
    public void test(String name, String lastname, String age){
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastname);
        driver.findElement(By.id("age")).sendKeys(age);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    @DataProvider
    public Object[][] getData1() throws IOException {
        String path1 = "C:\\Users\\etogr\\IdeaProjects\\Selenium3_TestNG\\src\\test\\java\\resources\\Personal Info.xlsx";

        FileInputStream fis = new FileInputStream(path1);
        Workbook wb = WorkbookFactory.create(fis);

        Sheet excel = wb.getSheet("Sayfa1");
        Faker faker = new Faker();
        Object[][] data = new Object[5][];
        for (int i = 0; i < data.length; i++) {
            String name = String.valueOf(excel.getRow(i+1).getCell(0));
            String surname = String.valueOf(excel.getRow(i+1).getCell(1));
            int yas = (int) (Math.random() * 100);
            String age = String.valueOf(yas);
            data[i] = new Object[]{name,surname,age};
        }
        return data;
    }
}
