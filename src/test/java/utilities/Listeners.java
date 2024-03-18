package utilities;

import org.testng.*;
import org.testng.annotations.ITestAnnotation;
import org.testng.xml.XmlSuite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

public class Listeners implements ITestListener, IReporter, IRetryAnalyzer, IAnnotationTransformer {

    @Override
    public void onTestStart(ITestResult result) {  //onTestStart methodunu parametresinde [ITestResult interfacesinden result objesi] olusturuldu
        //onTestStart her bir Test metodu başladığında çalışır.
        // Test methodlarının herbiri çalışmaya başladığında yapmak istediğiniz bir eylem varsa buraya girebilirsiniz.

        //ITestListener.super.onTestStart(result);
        System.out.println(result.getName()+" isimli testimiz başladı."+result.getTestContext().getStartDate());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //Test metodu PASSED olduğunda çalışır.
        //Bir Test methodu PASSED olduğunda yapmak istediğiniz bir eylem varsa buraya girebilirsiniz.

        //ITestListener.super.onTestSuccess(result);  // bunu yoruma alsak da calisir
        System.out.println(result.getName()+" isimli testimiz PASSED oldu.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //Bir test metodu FAILED olduğunda devreye girer.
        //Bir Test methodu FAILED olduğunda yapmak istediğiniz bir eylem varsa buraya girebilirsiniz.

        //ITestListener.super.onTestFailure(result);
        System.out.println(result.getName()+" isimli testimiz FAILED oldu.");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //Bir test metodu ignore edildiğinde devreye girer.
        //Bir Test methodu skip olduğunda yapmak istediğiniz bir eylem varsa buraya girebilirsiniz.

        //ITestListener.super.onTestSkipped(result);
        System.out.println(result.getName()+" isimli testimiz skip edildi.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        //Bir test methodu zaman aşımından FAILED olduğunda devreye girer.
        //Böyle bir durum gerçekleştiğinde yapmak istediğiniz bir eylem varsa buraya girebilirsiniz.

        //ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println(result.getName()+" isimli testimiz zaman aşımından dolayı FAILED oldu.");
    }

    @Override
    public void onStart(ITestContext context) {
        //Bütün testler başlar başlamaz devreye girer. BeforeSuite gibi çalışır
        //Test execution başlar başlamaz yapmak istediğiniz bir eylem varsa buraya girebilirsiniz.

        //ITestListener.super.onStart(context);
        System.out.println("Testlerimiz koşmaya başlıyor.");
    }

    @Override
    public void onFinish(ITestContext context) {
        //Bütün testler bitince devreye girer. AfterSuite gibi düşünebiliriz.
        //Test execution bittiğinde yapmak istediğiniz bir eylem varsa buraya girebilirsiniz.

        //ITestListener.super.onFinish(context);
        System.out.println("Test koşumu bitmiştir. Geçmiş olsun.");
    }


    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        // Rapor oluşturma işlemleri burada gerçekleştirilir.
        // xmlSuites: XML suite'ler listesi
        // suites: Suite'ler listesi
        // outputDirectory: Raporların oluşturulacağı dizin

        // HTML rapor dosyasının tam yolu ve adı
        String reportFilePath = outputDirectory + File.separator + "test-report.html";

        try {
            // HTML raporu oluşturmak için bir BufferedWriter oluştur
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(reportFilePath)));

            // HTML başlığını yaz
            writer.write("<!DOCTYPE html>");
            writer.write("<html>");
            writer.write("<head>");
            writer.write("<title>Test Raporu</title>");
            writer.write("</head>");
            writer.write("<body>");

            // Test sonuçlarını yaz
            writer.write("<h1>Test Sonuçları</h1>");
            for (ISuite suite : suites) {
                writer.write("<h2>Suite: " + suite.getName() + "</h2>");
                for (String testName : suite.getResults().keySet()) {
                    writer.write("<h3>Test: " + testName + "</h3>");
                    writer.write("<ul>");
                    for (ITestResult result : suite.getResults().get(testName).getTestContext().getPassedTests().getAllResults()) {
                        writer.write("<li>Test Başarılı: " + result.getName() + "</li>");
                    }
                    for (ITestResult result : suite.getResults().get(testName).getTestContext().getFailedTests().getAllResults()) {
                        writer.write("<li>Test Başarısız: " + result.getName() + "</li>");
                    }
                    for (ITestResult result : suite.getResults().get(testName).getTestContext().getSkippedTests().getAllResults()) {
                        writer.write("<li>Test Atlandı: " + result.getName() + "</li>");
                    }
                    writer.write("</ul>");
                }
            }

            // HTML raporunu tamamla
            writer.write("</body>");
            writer.write("</html>");

            // BufferedWriter'ı kapat
            writer.close();

            System.out.println("HTML raporu oluşturuldu: " + reportFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int retryCount = 0;
    private static final int maxRetryCount = 3;
    //Başarısız test seneyalorını
    // test PASSED degilse 3 defa test yap
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
        annotation.setRetryAnalyzer(Listeners.class);
    }


    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;

        }
        return false;
    }
}
