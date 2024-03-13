package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C18_DataProvider extends TestBase {
    //farkli bir class dan datalarimizi da alarak kullanbilirz, bunun icin data provider olan
    //methodu dogru sekilde parametre olarak test methoduna entegre etmeliyiz.

    @Test(dataProvider = "getData",dataProviderClass = C19_DataProviderClass.class)  //class 19 dan methodu aldik
    public void test(String username, String password){
        System.out.println("username : " + username + ",  password : " + password);
    }

    @Test(dataProvider = "getData1",dataProviderClass = C17_DataProviderFaker.class)  //class 17 dan methodu aldik
    public void test2(String username, String password){
        System.out.println("username : " + username + ",  password : " + password);
    }


}
