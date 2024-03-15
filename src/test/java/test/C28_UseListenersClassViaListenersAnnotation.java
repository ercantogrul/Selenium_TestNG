package test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utilities.Listeners.class)  // 1. yöntemle Listeners classimizi Test Classimiza bagladik
                                        // Classimiz run ettigimizde raporlara ulasiriz
public class C28_UseListenersClassViaListenersAnnotation {
    @Test
    public void successfulTest(){
        Assert.assertEquals(1,1);

    }

    @Test
    public void failedTest(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void successTest(ITestContext context){
        System.out.println(context.getFailedTests().size()); // @Listeners(utilities.Listeners.class)  in daki testlerin tamaminda [getFailedTests().size()] ile
        Assert.assertTrue(true);                              // fail olanlarin sayisini verir
        context.setAttribute("data",10);
        int x = (int) context.getAttribute("data");
        System.out.println("x = " + x);
    }
}
