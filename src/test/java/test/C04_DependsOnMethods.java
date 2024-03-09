package test;

import org.testng.annotations.Test;

public class C04_DependsOnMethods {

    // DependsOnMethods test method'larinin calisma siralamasina karismaz
    // Sadece bagli olan test, baglandigi testin sonucuna bakar
    // baglandigi test PASSED olmazsa, baglanan test hic calismaz(ignore)

    @Test
    void startCar(){
        System.out.println("araba calistir");// Bu test BAĞIMSIZ test
    }

    @Test(dependsOnMethods = {"startCar"})//bu testin calismasi startCar testinin hatasiz calismasina bagli
    void driveCar(){
        System.out.println("araba sur");
    }

    @Test(dependsOnMethods = {"parkCar"})//bu testin calismasi parkCar testinin hatasiz calismasina bagli
    void stopCar(){
        System.out.println("araba stop et");
    }

    @Test(dependsOnMethods = {"driveCar"})//bu testin calismasi driveCar testinin hatasiz calismasina bagli
    void parkCar(){
        System.out.println("araba park et");
    }

    /*
araba calistir
araba sur
araba park et
araba durdur
     */
}