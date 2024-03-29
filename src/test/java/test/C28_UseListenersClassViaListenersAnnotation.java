package test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utilities.Listeners.class)   //1.yöntemle [@Listeners(utilities.Listeners.class) ile] Listeners classımızı Test Classımıza bağladık
                                        // Classımızı run ettiğimizde raporlara ulaşırız.
public class C28_UseListenersClassViaListenersAnnotation {
    @Test(dependsOnMethods = "successTest") // successTest testi önce kosmali ki bunuda (dependsOnMethods = "successTest") ile yaptik
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
        Thread.sleep(1001);
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
