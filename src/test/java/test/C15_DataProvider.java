package test;

import utilities.ReusableMethods;
import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C15_DataProvider extends TestBase {
            /*
    @DataProvider bir TestNG annotation’idir.
    Dolayisiyla sadece TestNG ile kullanilir.
    Veri sağlamak için kullanılır/ TestNG'deki verilerin listesini almak için kullanılır
    DDT (Data Driven Test) yapilir
    Cucumber’daki Scenario Outline ile ayni isleve sahiptir
    DataProvider ile bir yöntemden test yöntemine veri nasıl geçirilir?
    -Test yönteminde dataProvider kullanın ve acıklamayı yöntem adına eşit olarak ayarlayın
       name ="alternative name" kullanarak alternatif isim verebiliriz.
     */
  // iki türlü data baglama yani iliskilendirme  yönte mi var;
    //1- ya olusturulan methodun ismi ile iliskilendirildi
    //2-  ya da DataProvider a verilen isim ile iliskilendirildi

    //Go to URL: https://www.amazon.com
  //Search for java, javascript, phython

    @Test(dataProvider = "getData") // ya olusturulan methodun ismi ile iliskilendirildi
    public void test1(String kelime){
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime+ Keys.ENTER);
    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"java"},
                {"javascript"},
                {"pyhton"}
        };

    }
    @Test(dataProvider = "aranacakKelime") // ya da DataProvider a verilen isim ile iliskilendirildi
    public void test2(String kelime){
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime+ Keys.ENTER);

    }
    @DataProvider(name="aranacakKelime")
    public Object[][] getData2(){
        Object[][] data={
                {"java"},{"javascript"},{"pyhton"}
        };
        return data;
    }
    @Test(dataProvider = "getData3")
    public void test3(String kelime){
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime+ Keys.ENTER);
    }
    @DataProvider
    public Object[] getData3(){
        Object[] data={
                "java","javascript","pyhton"
        };
        return data;
    }
    @Test(dataProvider = "getData4")
    public void test4(String kelime){
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime+ Keys.ENTER);
    }
    @DataProvider
    public Object[][] getData4(){
        Object[][] data= new Object[3][1]; // Object[][] data= new Object[3][]; seklinde de olabilir
        data[0]= new Object[]{"java"};
        data[1]= new Object[]{"javascript"};
        data[2]= new Object[]{"pyhton"};
        return data;
    }

}
