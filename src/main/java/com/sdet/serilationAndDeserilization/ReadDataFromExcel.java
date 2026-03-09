package com.sdet.serilationAndDeserilization;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir")+"/testData/UsersData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Credentials");

        System.out.println(xssfSheet.getRow(1).getCell(1));
        System.out.println(xssfSheet.getRow(1).getCell(2));
    }
}
