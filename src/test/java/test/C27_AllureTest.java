package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class C27_AllureTest {

    @Severity(SeverityLevel.CRITICAL)  // testin önemderecesini gösteriyor alluer raporlamaya göre
    @Test
    public void test1(){
        Assert.assertTrue(true);
        System.out.println("testcase1 dogru sekilde calismistir");
    }

    @Severity(SeverityLevel.NORMAL)  //
    @Test
    public void test2(){// hata oldugunda nasil rapor veriyor
        Assert.assertTrue(false);
        System.out.println("testcase2 dogru sekilde calismamistir");
    }

    @Description("bu test methodu skip edilecek")
    @Test
    public void test3(){
        throw new SkipException("test3 skip edilecek");
    }

    @Description("bu test methodu skip edilecek")
    @Test
    public void test4(){
        throw new SkipException("test4 skip edilecek");
    }
}
