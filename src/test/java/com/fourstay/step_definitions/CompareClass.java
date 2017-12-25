package com.fourstay.step_definitions;

import java.util.ArrayList;
import org.junit.Assert;
import com.fourstay.utilities.ExcelUtils;

public class CompareClass {

	public static void main(String[] args) throws Exception {
		String file1 = "/Users/bogdanlutsenko/Desktop/file1.xlsx";
		String file2 = "/Users/bogdanlutsenko/Desktop/file2.xlsx";
		
		ArrayList<String> numberFile1=new ArrayList<>();
		ExcelUtils.openExcelFile(file1, "Sheet1");
		for (int i = 1; i < ExcelUtils.getUsedRowsCount(); i++) {
			numberFile1.add(ExcelUtils.getCellData(i, 0));
		}
		
		ExcelUtils.openExcelFile(file2, "Sheet1");
		ArrayList<String> numberFile2=new ArrayList<>();
		for (int j = 1; j < ExcelUtils.getUsedRowsCount(); j++) {
			numberFile2.add(ExcelUtils.getCellData(j, 0));
		}
		
		
		Assert.assertEquals(numberFile1, numberFile2);
		System.out.println(numberFile1.equals(numberFile2));
		
		
		
		System.out.println(numberFile1);
		
		
		System.out.println(numberFile2);
		
		ArrayList<String> numberFile3=new ArrayList<>();
		ExcelUtils.openExcelFile(file1, "Sheet1");
		for (int i = 1; i < ExcelUtils.getUsedRowsCount(); i++) {
			numberFile3.add(ExcelUtils.getCellData(i, 1));
		}
		
		ExcelUtils.openExcelFile(file2, "Sheet1");
		ArrayList<String> numberFile4=new ArrayList<>();
		for (int j = 1; j < ExcelUtils.getUsedRowsCount(); j++) {
			numberFile4.add(ExcelUtils.getCellData(j, 1));
		}
		
		
		Assert.assertEquals(numberFile3, numberFile4);
		System.out.println(numberFile3);
		System.out.println(numberFile4);
		
		ArrayList<String> numberFile5=new ArrayList<>();
		ExcelUtils.openExcelFile(file1, "Sheet1");
		for (int i = 1; i < ExcelUtils.getUsedRowsCount(); i++) {
			numberFile5.add(ExcelUtils.getCellData(i, 2).trim());
		}
		
		ExcelUtils.openExcelFile(file2, "Sheet1");
		ArrayList<String> numberFile6=new ArrayList<>();
		for (int j = 1; j < ExcelUtils.getUsedRowsCount(); j++) {
			String[] city1=ExcelUtils.getCellData(j,2).split(",");
			String city2=city1[0].trim();
			//System.out.println(city2+"~~~~~~~~~~~~");
			numberFile6.add(city2);
		}
		
		
		Assert.assertEquals(numberFile5, numberFile6);
		System.out.println(numberFile5);
		System.out.println(numberFile6);
		
		
		
		ArrayList<String> numberFile7=new ArrayList<>();
		ExcelUtils.openExcelFile(file1, "Sheet1");
		for (int i = 1; i < ExcelUtils.getUsedRowsCount(); i++) {
			numberFile7.add(ExcelUtils.getCellData(i, 3).trim());
		}
		
		ExcelUtils.openExcelFile(file2, "Sheet1");
		ArrayList<String> numberFile8=new ArrayList<>();
		for (int j = 1; j < ExcelUtils.getUsedRowsCount(); j++) {
			String[] city1=ExcelUtils.getCellData(j,2).split(",");
			String city2=city1[1].trim();
			//System.out.println(city2+"~~~~~~~~~~~~");
			numberFile8.add(city2);
		}
		
		
		Assert.assertEquals(numberFile7, numberFile8);
		System.out.println(numberFile7);
		System.out.println(numberFile8);
		
		ArrayList<String> numberFile9=new ArrayList<>();
		ExcelUtils.openExcelFile(file1, "Sheet1");
		for (int i = 1; i < ExcelUtils.getUsedRowsCount(); i++) {
			numberFile9.add(ExcelUtils.getCellData(i, 4).trim());
		}
		
		ExcelUtils.openExcelFile(file2, "Sheet1");
		ArrayList<String> numberFile10=new ArrayList<>();
		for (int j = 1; j < ExcelUtils.getUsedRowsCount(); j++) {
			numberFile10.add(ExcelUtils.getCellData(j, 3).trim());
		}
		
		
		Assert.assertEquals(numberFile9, numberFile10);
		System.out.println(numberFile9);
		System.out.println(numberFile10);
		
	}

}
