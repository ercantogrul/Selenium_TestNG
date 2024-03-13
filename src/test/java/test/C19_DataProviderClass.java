package test;

import org.testng.annotations.DataProvider;

public class C19_DataProviderClass {

    @DataProvider
    public Object[][] getData(){
        Object [][] data = {{"ahmet","123"}, {"zehra" , "12345"}};
        return data;
    }

}
