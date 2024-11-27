package excelRead;

import java.io.IOException;

public class ExcelReadMain {

	public static void main(String[] args) throws IOException {
		ExcelRead exl=new ExcelRead();
		exl.readFile();
		String str=exl.readData(1, 1);
		System.out.println("value= "+str);

	}

}
