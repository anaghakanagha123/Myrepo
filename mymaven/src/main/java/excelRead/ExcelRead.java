package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	XSSFSheet sh;//creating instance variable for sheet
	
	public ExcelRead() throws IOException {
		
		FileInputStream fp=new FileInputStream("C:\\Users\\anagh\\git\\Myrepo\\mymaven\\src\\main\\resources\\Book1.xlsx");//fetching the excel file location and creating object for this
		
		XSSFWorkbook wb=new XSSFWorkbook(fp);//creating object for work book or fetching work book from file location
		
		sh=wb.getSheet("Sheet1");//fetching the sheet using sheet name from workbook object
		
	}
	
	public void readFile() {
		
		for(Row r:sh) {
			
			for(Cell c:r) {
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public String readData(int i,int j) {
		
		//Row r= sh.getRow(i);
		//Cell c=r.getCell(j);
		        //or
		Cell c=sh.getRow(i).getCell(j);
		
		int cellType=c.getCellType();
		
		switch(cellType) {
		case Cell.CELL_TYPE_STRING:
			String data=c.getStringCellValue();
			return data;
			
		case Cell.CELL_TYPE_NUMERIC:
			double number=c.getNumericCellValue();
			return String.valueOf(number);
			
			default:
				System.out.println("invalid");
				return null;
		
		
		}
		
		
	}
	
	
	
	
	

}
