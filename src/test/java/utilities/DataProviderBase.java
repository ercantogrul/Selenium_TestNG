package utilities;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderBase {

    static FileInputStream fis = null;
    Workbook wb = null;

    @DataProvider
    public String[] dataName(){
        String path = "C:\\Users\\etogr\\IdeaProjects\\Selenium3_TestNG\\src\\test\\java\\resources\\Personal Info.xlsx";

        //Open the workbook using file
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Work Book factory:
        try {
            wb = WorkbookFactory.create(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Open the first worksheet
        Sheet sheet1 = wb.getSheet("Sayfa1");//

        String[] names = new String[5]; // tek boyutlu 5 elemanli ici bos bir Array tanimlandi
        for (int i = 1; i <= 5; i++) {
            names[i-1]= sheet1.getRow(i).getCell(0).toString();
            System.out.print(names + " ");
        }
        return names;
    }
    @DataProvider
    public Object[][] fakerData(){
        String [][] fullname=new String[5][];
        for (int i = 0; i <5 ; i++) {
            fullname[i]= new String[]{Faker.instance().name().name(), Faker.instance().name().lastName()};
        }
        return fullname;
    }

    @DataProvider
    public String[][] dataFullName(){
        String path = "C:\\Users\\etogr\\IdeaProjects\\Selenium3_TestNG\\src\\test\\java\\resources\\Personal Info.xlsx";

        //Open the workbook using file
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Work Book factory:
        try {
            wb = WorkbookFactory.create(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Open the first worksheet
        Sheet sheet1 = wb.getSheet("Sayfa1");
        String[][] names = new String[5][];  // iki boyutlu ve ici bos 5 elemanli String bir Array olustruruldu

        for (int i = 0; i < 5; i++) {

            names[i]= new String[]{sheet1.getRow(i).getCell(0).toString(),
                    sheet1.getRow(i).getCell(1).toString()};

            System.out.print(names + " ");

        }
        return names;

    }
    //**********************bir excell den veri leri alip test etme @DataProvider METHODU ************
    @DataProvider
    public Object[][] firsName_LastName_age(){
        String path = "C:\\Users\\etogr\\IdeaProjects\\Selenium3_TestNG\\src\\test\\java\\resources\\Personal Info.xlsx";

        //Open the workbook using file
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Work Book factory:
        try {
            wb = WorkbookFactory.create(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Open the first worksheet
        Sheet sheet1 = wb.getSheet("Sayfa1");
       // String[][] names = new String[5][];
        Object[][] data = new Object[5][];// iki boyutlu ve ici bos 5 elemanli String bir Array olustruruldu
        for (int i = 0; i < data.length; i++) {
            String name = String.valueOf(sheet1.getRow(i+1).getCell(0));
            String surname = String.valueOf(sheet1.getRow(i+1).getCell(1));
            String age = String.valueOf(sheet1.getRow(i+1).getCell(2));

            data[i] = new Object[]{name,surname,age};
        }
        return data;
    }



}