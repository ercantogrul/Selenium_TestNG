package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) { // onTestStart test methodu basladiginda calisir
        ITestListener.super.onTestStart(result);
        System.out.println(result.getName()+ " isimli testimiz basladi.");
    }

    @Override
    public void onTestSuccess(ITestResult result) { // onTestSuccess test methodu PASSED oldugunda calisir
        ITestListener.super.onTestSuccess(result);
        System.out.println(result.getName() + " isimli testimiz PASSED oldu.");
    }

    @Override
    public void onTestFailure(ITestResult result) { // birtest methodu FAILED oldugunda calisir
        ITestListener.super.onTestFailure(result);
        System.out.println(result.getName() + " isimli testimiz FAILED oldu.");
    }

    @Override
    public void onTestSkipped(ITestResult result) { // bir test methodu ignore edildiginde devreye girer
        ITestListener.super.onTestSkipped(result);
        System.out.println(result.getName() + " isimli testimiz skip edildi.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) { // test zaman asiminda FAILED oldugunda devreye calisir
        ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println(result.getName() + " isimli testimiz zaman asimindan dolayi FAILED oldu.");
    }

    @Override
    public void onStart(ITestContext context) {  // bütün testler baslamadan önce devreye girer BeforeSuit gibi
        ITestListener.super.onStart(context);
        System.out.println("Testlerimiz kosmaya basliyor.");
    }

    @Override
    public void onFinish(ITestContext context) {  // bütün testler bittikten sonra devreye girer AfterSuit gibi
        ITestListener.super.onFinish(context);
        System.out.println("Testlerimiz kosumu bitmistir. Gecmis olsun.");
    }
}
