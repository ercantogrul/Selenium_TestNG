package test;

import org.testng.annotations.Test;

public class C12_XMLFilesGroups {
    @Test(groups = {"smoke"})
    void test1(){
        System.out.println("test1 smoke çalıştı");
    }
    @Test(groups = {"regression"})
    void test2(){
        System.out.println("test2 regression çalıştı");
    }
    @Test(groups = {"sanity"})
    void test3(){
        System.out.println("test3 sanity çalıştı");
    }
    @Test(groups = {"smoke", "sanity"})
    void test4(){
        System.out.println("test4 \"smoke\", \"sanity çalıştı");
    }
    @Test(groups = {"smoke", "regression"})
    void test5(){
        System.out.println("test5  çalıştı");
    }
    @Test(groups = {"regression"})
    void test6(){
        System.out.println("test6 regression çalıştı");
    }
    @Test(groups = {"smoke", "regression", "sanity"})
    void test7(){
        System.out.println("test7 \"smoke\", \"regression\", \"sanity\" çalıştı");
    }
}
