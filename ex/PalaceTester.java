package com.xworkz.javaproject.ex;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PalaceTester {

	public static void main(String[] args) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("PalaceDTO");
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"Id", "Palace", "Owned","Year","State","City","Country"});
        data.put("2", new Object[] {1,"Mysore Palace","Yaduvir",1878,"Karnataka","Mysore","India"});
        data.put("3", new Object[] {2,"TajMahala","Shahajahan",1894,"Dehli","Agra","India"});
        
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            // this creates a new row in the sheet
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                // this line creates a cell in the next column of that row
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String)obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
	        try {
	        	File file = new File("C:\\Users\\Dell\\Documents\\Palace.xlsx");
				FileOutputStream fos = new FileOutputStream(file);
	            wb.write(fos);
	            fos.close();
	            System.out.println("Written successfully on sheet");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
        }
    }
}