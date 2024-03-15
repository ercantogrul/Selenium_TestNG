package test;

import utilities.TestBase;
import org.testng.annotations.Test;

public class C22_ParallelTest extends TestBase {
    @Test
    public void test1(){driver.get("https://www.amazon.com./");}

    @Test
    public void test2(){driver.get("https://www.n11.com/");}

    @Test
    public void test3(){driver.get("https://www.trendyol.com/");}

    @Test
    public void test4(){driver.get("https://www.amazon.com./");}
}