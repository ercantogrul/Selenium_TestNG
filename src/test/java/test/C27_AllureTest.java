package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class C27_AllureTest {
    //  Terminal icinde-windows Power Shell de- [mvn clean test] ENTER; sonra [allure serve] ENTER diyerek allure raporlama alirclean
    /*
    -Allure, TestNG gibi test çerçevelerinde kullanılan bir raporlama aracıdır.
    Allure, test sonuçlarını görsel olarak çekici ve anlaşılır bir şekilde sunmak için tasarlanmıştır.
    Allure raporlama aracı, testlerin çalıştırılması sırasında elde edilen verileri alır ve bu verileri etkileyici bir şekilde sunar.

    TestNG ile entegre edildiğinde, testlerin sonuçlarını, başarı oranlarını, hata mesajlarını ve daha fazlasını kapsayan detaylı bir rapor oluşturur.
    Bu raporlar genellikle HTML formatında sunulur ve test sonuçlarını görsel grafiklerle, grafiksel elementlerle ve detaylı açıklamalarla birlikte gösterir.

   Allure, testlerin daha iyi anlaşılmasını sağlar ve hata ayıklama sürecini kolaylaştırır. Ayrıca, test ekiplerinin test sonuçlarını paylaşmasını ve
   değerlendirmesini kolaylaştırır. Bu nedenle, TestNG kullanıcıları için Allure, test raporlaması ve test sonuçlarının izlenmesi için kullanışlı bir araçtır.
     */

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
