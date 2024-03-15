package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C23_ParallelTestParameter {
    @Test(threadPoolSize = 4,invocationCount = 8,timeOut = 4000)
    //-- bir methodu birden fazla defa paralel kosturmak icin kac thread calisacagini threadPoolSize ile belirliyoruz.
    // threadPoolSize 2 den fazla olursa threadPoolSize dogru calisir (1 olursa invocationCount adedince threadPoolSize olusur)
    //-- Test Methodunun kac defa kosacagini invocationCount ile belirliyoruz
    //-- timeOut bir kosuma ayrilmis maximum süreyi belirler
    public void test1(){
        System.out.println("thread id: "+Thread.currentThread().getId());
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com./");
        driver.quit();
    }
}
