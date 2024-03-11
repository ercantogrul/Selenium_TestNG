package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
        /*
     TestBase Class : Her test class'inda tekrar tekrar yazdigimiz setup ve teardown method'lari tekrar
    yazmaktan kurtulmak icin Java OOP konsept'I kullanarak olusturdugumuz bir class'dir
    -Test Base'I parent olarak Kabul eden class'lar hazirlik icin olusturdugumuz driver, setup( ) ve
    teardown( ) olusturmak zorunda kalmazlar, kendilerinde olmasa bile parent class'dan kullanilmis
    olur.
    -TestBase genelde testlerden farkli bir package'da oldugundan driver'i kullanabilmek icin public
    veya protected yapmamiz gerekir. Biz hep child class'lardan kullanacagimiz icin protected yapmayi
    tercih ettik
    -Bu class sadece child class'lardan inheritance ozellikleri ile kullanilsin istedigimizden, bu class'in
    obje olusturularak kullanilmasina engel olmak icin class'I abstract YAPABILIRIZ.

    -Abstract yaparak TestBase Class'ından obje oluşturulmasının önüne geçeriz.
    TestBase Class'ı sadece extends ile inherit ederek kullanacağız.
    Dolayısıyla oluşturduğumuz driver variable'i için protected access modifier seçiyoruz.
     */

    protected static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
