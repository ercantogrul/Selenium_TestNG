package test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class C30_UseListenersClassViaRunConfiguration {
    //2.YÖNTEM
    //Listeners Classı ile Test Classımızı Run-> Edit config ile çıkan ekrandan bağlayabiliriz.
    //Ayrıca yine aynı ekrandan diğer raporlama yöntemlerinden istediklerimizi dahil edebiliriz
    @Test(dependsOnMethods = "successTest")    // successTest testi önce kosmali ki bunuda (dependsOnMethods = "successTest") ile yaptik
    // successfulTest methodundaki [context.getAttribute("data");] veriable si ni kulanabilelim
    public void successfulTest(ITestContext context){
        Assert.assertEquals(1,1);
        int i = (int) context.getAttribute("data");
        System.out.println("i = " + i);

    }

    @Test
    public void failedTest(){
        Assert.assertEquals(1,2);
    }

    @Test (timeOut = 1000)
    public void failedTestTimeout() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("I'm inside the failedTestTimeout test method");

    }

    @Test
    public void successTest(ITestContext context){
        System.out.println(context.getFailedTests().size());
        Assert.assertTrue(true);
        context.setAttribute("data",10);
        int x = (int) context.getAttribute("data");
        System.out.println("x = " + x);
    }
}
