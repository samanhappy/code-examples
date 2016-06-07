package org.util.file;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelMaker
{

    public void makeExcel(boolean append, String filePath, String sheetName) throws Exception
    {
        HSSFWorkbook hssWorkBook;
        HSSFSheet hssSheet;
        if (append && new File(filePath).exists())
        {
            hssWorkBook = new HSSFWorkbook(new FileInputStream(filePath));
            hssSheet = hssWorkBook.getSheetAt(0);
        }
        else
        {
            hssWorkBook = new HSSFWorkbook();
            hssSheet = hssWorkBook.createSheet();
        }
        hssWorkBook.setSheetName(0, sheetName);
        
        HSSFRow header = hssSheet.createRow(0);
        
        hssWorkBook.close();
    }

    public static void main(String[] args)
    {

    }
}
