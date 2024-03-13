package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class C08_AssertionInfo {
    @Test
    public void hard(){
        //hard assertionlar Assert classi uzerinden cagirdigimiz ve bildigimiz methodlardir..
        //test executioni sirasinda herhangi bir assertion failed olursa test execution o anda durur
        System.out.println("checcking 1=2");
        Assert.assertEquals(1,2);

        System.out.println("checcking 1=1");
        Assert.assertEquals(1,1); // passed




    }

    @Test
    public void soft(){
        //soft assertionlar

        SoftAssert sa = new SoftAssert();  // soft assertion icin önce O class dan bir obje üretilir
       // üretilen obje ile assert methodu cagrilir

        System.out.println("checcking 1=2");
        sa.assertEquals(1,2); // bu asasertion fail olsa bile java assertAll'a kadar executiona devam eder.

        System.out.println("checcking 1=1");
        sa.assertEquals(1,1); // bu asasertion fail olsa bile java assertAll'a kadar executiona devam eder.

        System.out.println("Hala assetAll calismadigi icin bu yazi konsola cikar");

        sa.assertAll();    // assertionslardan herhangi biri patladiginda java hata satiri olarak assertAll()'u gösterir


        System.out.println("bu yazi konsolda cikacak mi ?");//bu yazi cikmaz ..

        //assertionlarda hata olursa java hata olarak assertAll kodunda hata verir.

        //**hangi assetion da hata oldugunu kodlara bakarar gerekirse bazi assertion lari hard yaparak bulabliliriz.
        //cünkü direk hangi assertion da hata verdigi belli olmaz

    }
}
