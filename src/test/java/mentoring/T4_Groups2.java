package mentoring;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class T4_Groups2 extends TestBase {


    @Test()
    public void test01() {
        //Hard
        System.out.println("Test 1 -A başladı ");
        Assert.assertTrue(false);//Fail Hard Assert olduğunda sonraki komutlar çalışmaz
        System.out.println("Test 1 fail");
    }

    @Test()
    public void test02() {
        //Soft assert
        SoftAssert sa=new SoftAssert();
        sa.assertNotEquals(1,2);//Fail Soft Assert den sonra ki komutlar CALISIR
        System.out.println("Test 2 -B");
        sa.assertAll();
    }

    @Test()   // Eğer bizim testimiz hard assert olan bir teste bağlı ise ve fail almışssak çalışmaz
              //Eğer testimiz sof assert olan bir teste bağlı ise fail alsak bile testimiz çalışmaya devam eder.
    public void test03() {
        System.out.println("Test 3 -pass");
    }


}
