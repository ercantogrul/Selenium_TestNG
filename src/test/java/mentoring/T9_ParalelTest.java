package mentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class T9_ParalelTest {
    // Goto page: https://clarusway.com/ get title
//Goto page: https://www.ikea.com/ get title
//Goto page: https://www.eviltester.com/page/tools/testpages/ get title

    @Test
    public void test1(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test1 icin calisan thread - " + id);

        new ChromeDriver().get("https://clarusway.com/");

    }

    @Test
    public void test2(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test2 icin calisan thread - " + id);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ikea.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }


    @Test
    public void test3(){
        long id = Thread.currentThread().getId();
        System.out.println("bu test3 icin calisan thread - " + id);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.eviltester.com/page/tools/testpages/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @DataProvider (parallel = true, name = "test22")
    public void paralelProvider(){

    }
}
