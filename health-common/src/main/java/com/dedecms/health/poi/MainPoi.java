package com.dedecms.health.poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class MainPoi {

    public static void main(String[] args) {
            //  读取一个excel文件
        String  path ="D:\\课程资料\\项目-springboot传智健康-2.0-AB\\传智健康Day05-预约管理 √\\资料\\hello.xlsx";
        try {
            XSSFWorkbook  xssfWorkbook = new XSSFWorkbook(new FileInputStream(path));
            XSSFSheet sheetAt = xssfWorkbook.getSheetAt(0);

            for (Row row : sheetAt) {

                for (Cell cell : row) {

                    System.out.println(cell.getStringCellValue());
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
