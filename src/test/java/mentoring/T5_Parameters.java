package mentoring;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T5_Parameters {

    @Test
    @Parameters({"name","mail","age"})
    public void testMultiparametized(String name,String mail,String age){
        System.out.println("name = " + name);
        System.out.println("mail = " + mail);
        System.out.println("age = " + age);


    }

    @Test
    @Parameters({"city","country","name"})
    public void testTwoParametized(String city, String country, String name){
        System.out.println("city = " + city);
        System.out.println("country = " + country);
        System.out.println("name = " + name);


    }


}
