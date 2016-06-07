package org.util.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

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
        
        // 红色加粗字体边框样式
        HSSFCellStyle redBoldFontBorderStyle;
        
        // 红色加粗字体边框样式
        HSSFCellStyle blackBoldFontBorderStyle;
        
        // 自定义蓝色
        HSSFPalette customPalette = hssWorkBook.getCustomPalette();  
        customPalette.setColorAtIndex(HSSFColor.BLUE.index, (byte) 184, (byte) 204, (byte) 228);
        
        // 红色加粗字体
        HSSFFont redBoldFont = hssWorkBook.createFont();
        redBoldFont.setColor(HSSFColor.RED.index);
        redBoldFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        redBoldFont.setFontName("Arial");
        redBoldFontBorderStyle = hssWorkBook.createCellStyle();
        redBoldFontBorderStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        redBoldFontBorderStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        redBoldFontBorderStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        redBoldFontBorderStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        redBoldFontBorderStyle.setTopBorderColor(HSSFColor.BLACK.index);
        redBoldFontBorderStyle.setBottomBorderColor(HSSFColor.BLACK.index);
        redBoldFontBorderStyle.setTopBorderColor(HSSFColor.BLACK.index);
        redBoldFontBorderStyle.setLeftBorderColor(HSSFColor.BLACK.index);
        redBoldFontBorderStyle.setFont(redBoldFont);
        redBoldFontBorderStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        redBoldFontBorderStyle.setFillForegroundColor(HSSFColor.BLUE.index);
        redBoldFontBorderStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        
        // 黑色加粗字体
        HSSFFont blackBoldFont = hssWorkBook.createFont();
        blackBoldFont.setColor(HSSFColor.BLACK.index);
        blackBoldFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        blackBoldFont.setFontName("Arial");
        blackBoldFontBorderStyle = hssWorkBook.createCellStyle();
        blackBoldFontBorderStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        blackBoldFontBorderStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        blackBoldFontBorderStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        blackBoldFontBorderStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        blackBoldFontBorderStyle.setTopBorderColor(HSSFColor.BLACK.index);
        blackBoldFontBorderStyle.setBottomBorderColor(HSSFColor.BLACK.index);
        blackBoldFontBorderStyle.setTopBorderColor(HSSFColor.BLACK.index);
        blackBoldFontBorderStyle.setLeftBorderColor(HSSFColor.BLACK.index);
        blackBoldFontBorderStyle.setFont(blackBoldFont);
        blackBoldFontBorderStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        blackBoldFontBorderStyle.setFillForegroundColor(HSSFColor.BLUE.index);
        blackBoldFontBorderStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        
        HSSFRow headerRow = hssSheet.createRow(0);
        int minColumnWidth = 2500;
        for (int i = 0; i < 10; ++i)
        {
            String itemName = "标题_" + new Random().nextLong();
            HSSFCell headerCell = headerRow.createCell((short) i);
            headerCell.setCellValue(itemName);
            // 自适应宽度
            int width = itemName.getBytes().length * 256;
            hssSheet.setColumnWidth(i, width > minColumnWidth ? width : minColumnWidth);
            headerCell.setCellStyle(redBoldFontBorderStyle);
        }
        
        OutputStream os = null;
        hssWorkBook.write(os);
        
        hssWorkBook.close();
    }

    public static void main(String[] args)
    {

    }
}
