package test;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {
    // Dependsonmethods attribute u icerisine {} arasinda test isimleri alir
    // ve bu testler basirili olursa asil testimiz calisir
    // cok sayida testimiz varsa bagimli testleri her seferinde kontrol etmek yerine
    // testNg once bagimsiz olanları calistirir, sona bagimli testleri birakir, bu sekilde bir mantik gelistrmistir..

    //******** Dependsonmethods un oldugu yerde "priority: Öncelik sırası" pasifize olur************

    @Test
    public void loginTest(){System.out.println("login tested successfully");}

    @Test(dependsOnMethods = {"loginTest"})
    public void homepageTest(){System.out.println("homepage tested successfully");}


    @Test(dependsOnMethods = {"loginTest","homepageTest"})
    public void smokeTest(){
        System.out.println("smoke tests were done successfully");
    }


//    @Test(dependsOnMethods = {"loginTest","homepageTest"},enabled = false)  // böyle olursa sadece bu test calismaz
//    public void smokeTest(){
//        System.out.println("smoke tests were done successfully");
//    }

}

/*
login tested successfully
homepage tested successfully
smoke tests were done successfully
 */
