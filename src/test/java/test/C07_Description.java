package test;

import org.testng.annotations.Test;

public class C07_Description {
    // Test methodlarinin ne yaptigini aciklamak icin kullandigimiz attribute tur

    @Test(description = "this is testcase1")
    void testCase1() {
        System.out.println("SDET");
    }


    @Test(description = "this is testcase2")
    void testCase2() {
        System.out.println("QA Analyst");
    }


    @Test(description = "this is testcase3")
    void testCase3() {
        System.out.println("Software Developer");
    }

    /*
    SDET
    QA Analyst
    Software Developer
     */
}
