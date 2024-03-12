package test;

import utilities.ParameterBrowserTestBase;
import org.testng.annotations.Test;

public class C20_CrossBrowserTest extends ParameterBrowserTestBase {
    @Test
    public void test1(){driver.get("https://www.amazon.com./");}

    @Test
    public void test2(){driver.get("https://www.n11.com/");}

    @Test
    public void test3(){driver.get("https://www.trendyol.com/");}

    @Test
    public void test4(){driver.get("https://www.amazon.com./");}

    //bu test methodlari class seviyesinde calistirildiginda hepsi chrome browser da calisir,
    //cunku extends edilen ParametersBrowserClass da default olarak chrome browser secilidir
    //farkli browserlarda islem yapmak icin xml dosyasinda browserin parametre olarak belirtilmesi gerekir
}
